package br.com.financeManagerForAll.services;

import br.com.financeManagerForAll.dtos.NewUserRequest;
import br.com.financeManagerForAll.models.ManagementUserModel;
import br.com.financeManagerForAll.repositories.ManagementUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Log4j2
public class ManagementUserService implements UserDetailsService {

    private final ManagementUserRepository managementUserRepository;

    public ManagementUserModel saveNewUser(NewUserRequest newUserRequest) {
        ManagementUserModel savedUser = managementUserRepository.save(
                ManagementUserModel
                        .builder()
                        .username(newUserRequest.getUsername())
                        .encryptedPassword(new BCryptPasswordEncoder().encode(newUserRequest.getPassword()))
                        .isEnabled(true)
                        .isAccountNonExpired(true)
                        .isCredentialsNonExpired(true)
                        .isAccountNonLocked(true)
                        .build()
        );

        return ManagementUserModel
                .builder()
                .id(savedUser.getId())
                .username(savedUser.getUsername())
                .isEnabled(savedUser.getIsEnabled())
                .isAccountNonExpired(savedUser.getIsAccountNonExpired())
                .isCredentialsNonExpired(savedUser.getIsCredentialsNonExpired())
                .isAccountNonLocked(savedUser.getIsAccountNonLocked())
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            ManagementUserModel managementUserModel = managementUserRepository.findUserByUsername(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found with username " + username));
            return new User(managementUserModel.getUsername(),
                    managementUserModel.getPassword(),
                    managementUserModel.isEnabled(),
                    managementUserModel.isAccountNonExpired(),
                    managementUserModel.isCredentialsNonExpired(),
                    managementUserModel.isAccountNonLocked(),
                    managementUserModel.getAuthorities());
        } catch (Exception e) {
            log.error(e.toString());
            return null;
        }
    }
}

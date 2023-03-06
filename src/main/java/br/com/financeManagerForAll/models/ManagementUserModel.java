package br.com.financeManagerForAll.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MANAGEMENT_USER")
public class ManagementUserModel implements UserDetails, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, name = "USERNAME")
    private String username;

    @Column(nullable = false, name = "ENCRYPTED_PASSWORD")
    @JsonIgnore
    private String encryptedPassword;

    @Column(nullable = false, name = "IS_ENABLED")
    @JsonIgnore
    private Boolean isEnabled;

    @Column(nullable = false, name = "IS_ACCOUNT_NON_EXPIRED")
    @JsonIgnore
    private Boolean isAccountNonExpired;

    @Column(nullable = false, name = "IS_CREDENTIALS_NON_EXPIRED")
    @JsonIgnore
    private Boolean isCredentialsNonExpired;

    @Column(nullable = false, name = "IS_ACCOUNT_NON_LOCKED")
    @JsonIgnore
    private Boolean isAccountNonLocked;

    @ManyToMany
    @JoinTable(name = "MANAGEMENT_USER_ROLE",
            joinColumns = @JoinColumn(name = "MANAGEMENT_USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "MANAGEMENT_ROLE_ID"))
    private List<ManagementRoleModel> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return this.encryptedPassword;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }
}

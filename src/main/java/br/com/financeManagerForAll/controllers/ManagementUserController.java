package br.com.financeManagerForAll.controllers;

import br.com.financeManagerForAll.dtos.FindUserByUsername;
import br.com.financeManagerForAll.dtos.NewUserRequest;
import br.com.financeManagerForAll.services.ManagementUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/financeManagerForAll")
@Log4j2
@RequiredArgsConstructor
public class ManagementUserController {

    private final ManagementUserService managementUserService;

    @PostMapping(path = "/saveNewUser")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Object> saveNewUser(@RequestBody NewUserRequest newUserRequest){
        log.info("The endpoint 'saveNewUser' was called for user {}", newUserRequest.getUsername());
        return new ResponseEntity<>(managementUserService.saveNewUser(newUserRequest), HttpStatus.CREATED);
    }

    @GetMapping(path = "/findUserByUsername")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public ResponseEntity<Object> findUserByUsername(@RequestBody FindUserByUsername findUserByUsername){
        return new ResponseEntity<>(managementUserService.loadUserByUsername(
                findUserByUsername.getUsername()), HttpStatus.OK);
    }
}

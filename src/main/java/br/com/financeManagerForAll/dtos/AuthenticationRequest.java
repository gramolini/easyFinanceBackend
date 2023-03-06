package br.com.financeManagerForAll.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {

    private String username;

    private String encryptedPassword;
}

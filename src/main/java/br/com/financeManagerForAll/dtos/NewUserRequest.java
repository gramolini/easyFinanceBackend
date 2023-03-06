package br.com.financeManagerForAll.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewUserRequest {

    private String username;

    private String password;

    private Boolean isUser;

    private Boolean isAdmin;
}

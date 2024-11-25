package br.com.mateusfilpo.netflixauthserver.dto;

import java.util.HashSet;
import java.util.Set;

public class AuthRequestDTO {

    private String username;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();

    public AuthRequestDTO() {
    }

    public AuthRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

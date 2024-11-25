package br.com.mateusfilpo.netflixauthserver.dto;

import br.com.mateusfilpo.netflixauthserver.domain.Role;

import java.util.HashSet;
import java.util.Set;

public class AuthResponseDTO {

    private String username;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();

    public AuthResponseDTO() {
    }

    public AuthResponseDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}

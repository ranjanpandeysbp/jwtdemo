package com.mycompany.jwtdemo.model;

import org.springframework.security.core.GrantedAuthority;

public class AuthorityModel implements GrantedAuthority {

    private String authority;

    public AuthorityModel(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

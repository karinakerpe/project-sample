package com.example.mysql.security.oauth2;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;

public class UserOAuth2User implements OAuth2User {

    private OAuth2User oauth2User;

    public UserOAuth2User(OAuth2User oauth2User) {
        this.oauth2User = oauth2User;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return oauth2User.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getName() {
        return oauth2User.getAttribute("name");
    }
    public String getFullName(){
        return oauth2User.getAttribute("name");
    }
    public String getEmail() {
        return oauth2User.getAttribute("email");
    }
}

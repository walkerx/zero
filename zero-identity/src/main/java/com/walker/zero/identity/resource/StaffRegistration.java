package com.walker.zero.identity.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author walker
 */
public final class StaffRegistration {
    private final String username;
    private final String password;

    @JsonCreator
    public StaffRegistration(@JsonProperty("username") final String username,
                             @JsonProperty("password") final String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

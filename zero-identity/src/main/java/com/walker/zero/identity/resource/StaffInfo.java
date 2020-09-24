package com.walker.zero.identity.resource;

/**
 * @author walker
 */
public final class StaffInfo {
    private final String username;
    private final String password;

    public StaffInfo(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

}

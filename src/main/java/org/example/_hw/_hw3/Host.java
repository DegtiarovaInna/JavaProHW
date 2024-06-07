package org.example._hw._hw3;

import java.util.UUID;

public class Host {
    private UUID id;
    private String email;
    private String displayName;
    private String username;
    private String image;

    public Host(UUID id, String email, String displayName, String username, String image) {
        this.id = id;
        this.email = email;
        this.displayName = displayName;
        this.username = username;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Host{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                ", username='" + username + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

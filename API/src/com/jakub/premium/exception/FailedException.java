package com.jakub.premium.exception;

public class FailedException extends Exception {
    private final String path;
    private final String nickname;

    public String getPath() {
        return path;
    }

    public String getNickname() {
        return nickname;
    }

    public FailedException(String path) {
        this.path = path;
        this.nickname = "*UNKNOWN*";
    }

    public FailedException(String path, String nickname) {
        this.path = path;
        this.nickname = nickname;
    }
}

package com.jakub.premium.api;

import com.jakub.premium.exception.FailedException;

import java.util.Set;
import java.util.UUID;

public interface App {
    Set<? extends User> getCachedUserProfiles();
    User getCachedUserProfile(String lastNickname);
    User getCachedUserProfile(UUID premiumId);

    void forceLogin(User user) throws FailedException;
    void forceRegister(User user, String password) throws FailedException;
    void forceUnregister(User user) throws FailedException;
    void forceChangePassword(User user, String password) throws FailedException;
    void forcePremium(User user) throws FailedException;
    void forceCracked(User user, String password) throws FailedException;
    void forceStartSession(User user, int time) throws FailedException;
    void forceDestroySession(User user) throws FailedException;
}

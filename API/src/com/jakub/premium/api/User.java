package com.jakub.premium.api;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.sql.Timestamp;
import java.util.UUID;

public interface User {
    UUID getUniqueId();
    UUID getPremiumId();
    String getLastNickname();
    String getHashedPassword();
    Timestamp getSessionExpire();
    String getLastServer();
    String getLastAddress();
    Timestamp getLastSeen();
    String getFirstAddress();
    Timestamp getFirstSeen();

    ProxiedPlayer getProxiedPlayer();

    boolean hasLastNickname();
    boolean hasSession();
    boolean hasLastServer();
    boolean hasLastAddress();
    boolean hasLastSeen();
    boolean hasFirstAddress();
    boolean hasFirstSeen();
    boolean hasAddress(String address);

    boolean isPremium();
    boolean isRegistered();
    boolean isLogged();
    boolean isOnline();
}

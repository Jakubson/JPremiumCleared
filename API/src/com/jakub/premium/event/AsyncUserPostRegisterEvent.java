package com.jakub.premium.event;

import com.jakub.premium.api.User;
import net.md_5.bungee.api.CommandSender;

public class AsyncUserPostRegisterEvent extends AsyncUserPostEvent {
    public AsyncUserPostRegisterEvent(User user) {
        super(user, null);
    }

    public AsyncUserPostRegisterEvent(User user, CommandSender commandSender) {
        super(user, commandSender);
    }
}
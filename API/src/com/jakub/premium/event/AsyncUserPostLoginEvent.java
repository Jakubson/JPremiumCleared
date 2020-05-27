package com.jakub.premium.event;

import com.jakub.premium.api.User;
import net.md_5.bungee.api.CommandSender;

public class AsyncUserPostLoginEvent extends AsyncUserPostEvent {
    public AsyncUserPostLoginEvent(User user) {
        super(user, null);
    }

    public AsyncUserPostLoginEvent(User user, CommandSender commandSender) {
        super(user, commandSender);
    }
}

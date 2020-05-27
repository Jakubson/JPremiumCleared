package com.jakub.premium.event;

import com.jakub.premium.api.User;
import net.md_5.bungee.api.CommandSender;

public class AsyncUserPostUnregisterEvent extends AsyncUserPostEvent {
    public AsyncUserPostUnregisterEvent(User user, CommandSender commandSender) {
        super(user, commandSender);
    }
}

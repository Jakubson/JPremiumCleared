package com.jakub.premium.event;

import com.jakub.premium.api.User;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Event;

public class AsyncUserPostEvent extends Event {
    private final User user;
    private final CommandSender commandSender;

    public User getUser() {
        return user;
    }

    public CommandSender getCommandSender() {
        return commandSender;
    }

    public boolean hasCommandSender() {
        return commandSender != null;
    }

    public AsyncUserPostEvent(User user, CommandSender commandSender) {
        this.user = user;
        this.commandSender = commandSender;
    }
}
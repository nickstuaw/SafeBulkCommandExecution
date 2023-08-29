package com.nickinnovates.safebulkcommandexecution;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.EventListener;

public class CommandEventListener implements Listener {

    public CommandEventListener() {}

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerCommandPreProcessEvent(PlayerCommandPreprocessEvent event) {
        // Fetch the message ("/...")
        String message = event.getMessage();
        // Check for the separator.
        if(!message.contains(" && "))
            return;
        // Split the message.
        String[] commands = message.split(" && ");
        for(String command : commands) {
            event.getPlayer().performCommand(command);
        }
        event.setCancelled(true);
    }

}

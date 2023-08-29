package com.nickinnovates.safebulkcommandexecution;

import org.bukkit.plugin.java.JavaPlugin;

public final class SafeBulkCommandExecution extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new CommandEventListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

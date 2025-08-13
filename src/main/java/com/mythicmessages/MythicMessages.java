package com.mythicmessages;

import org.bukkit.plugin.java.JavaPlugin;

public class MythicMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MessageHandler(this), this);
        getLogger().info("MythicMessages enabled with mythic flair!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MythicMessages disabled. Farewell, traveler.");
    }
}
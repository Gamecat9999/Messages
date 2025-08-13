package com.mythicmessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.Plugin;

public class MessageHandler implements Listener {

    private final Plugin plugin;

    public MessageHandler(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String biome = player.getLocation().getBlock().getBiome().name().toLowerCase().replace("_", " ");
        String message = ChatColor.GOLD + "⚡ " + ChatColor.YELLOW + player.getName() + " emerges from the " + biome + ".";
        event.setJoinMessage(message);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String message = ChatColor.DARK_RED + "✦ " + ChatColor.RED + player.getName() + " vanishes into legend.";
        event.setQuitMessage(message);
    }
}
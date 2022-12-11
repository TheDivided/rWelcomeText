package ru.divided.mc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("I'v been started!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    private void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(ChatColor.AQUA + "Добро пожаловать на сервер!");
    }
}
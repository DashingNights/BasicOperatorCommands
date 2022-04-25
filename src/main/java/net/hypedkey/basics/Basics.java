package net.hypedkey.basics;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class Basics extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info(Color.YELLOW + "Basics Plugin enabled!");
        this.getCommand("spawn").setExecutor(new CommandSpawn(this));
        this.getCommand("gmc").setExecutor(new Gmc(this));
        this.getCommand("gms").setExecutor(new Gms(this));
        this.getCommand("boom").setExecutor(new Smite(this));
    }
}

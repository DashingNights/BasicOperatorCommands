package net.hypedkey.basics;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class Basics extends JavaPlugin {

    Gmc gamemodec = (new Gmc(this));
    Gms gamemodes = (new Gms(this));
    Smite smite= (new Smite(this));
    CommandSpawn commandSpawn = (new CommandSpawn(this));

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info(Color.YELLOW+"Plugin enabled.");
        this.getCommand("spawn").setExecutor(commandSpawn);
        this.getCommand("gmc").setExecutor(gamemodec);
        this.getCommand("gms").setExecutor(gamemodes);
        this.getCommand("boom").setExecutor(smite);

    }
}

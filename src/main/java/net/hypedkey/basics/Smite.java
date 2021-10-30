package net.hypedkey.basics;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Smite implements CommandExecutor {

    private final Basics main;

    public Smite(Basics plugin) {
        main = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            p.getWorld().strikeLightningEffect(p.getLocation());
        }
        return true;
    }
}

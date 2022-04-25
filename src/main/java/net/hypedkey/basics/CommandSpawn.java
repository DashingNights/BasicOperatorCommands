package net.hypedkey.basics;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandSpawn implements CommandExecutor {
    private final Basics main;

    public CommandSpawn(Basics plugin) {
        main = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (main.getConfig().getBoolean("spawn_cmd_enabled")) {
            if (sender instanceof Player p) {
                p.teleport(p.getWorld().getSpawnLocation());
                p.sendMessage(color(main.getConfig().getString("SpawnCommandMessage")));
            }
        }else{
            sender.sendMessage(color("&cThis command is disabled in config!"));
        }
        return true;
    }

    public static String color(String s){
        return ChatColor.translateAlternateColorCodes('&',s);
    }
}






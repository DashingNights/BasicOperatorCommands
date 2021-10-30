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
        Player player = (Player) sender;
        if (main.getConfig().getBoolean("true")) {
            if (sender instanceof Player) {
                World hub = player.getWorld();
                Location loc = new Location(hub,132,65,57,0,0);
                player.teleport(loc);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("SpawnCommandMessage")));

            }
            return true;
        }
        else {

            }
        return false;
    }
}






package net.hypedkey.basics;


import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gms implements CommandExecutor {

    private final Basics main;

    public Gms(Basics plugin) {
        main = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("GmsMsg")));
        }
        return true;
    }
}

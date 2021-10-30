package net.hypedkey.basics;


import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gmc implements CommandExecutor {

    private final Basics main;

    public Gmc(Basics plugin) {
        main = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("GmcMsg")));


        }
        return true;
    }
}

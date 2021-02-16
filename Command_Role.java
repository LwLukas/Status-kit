package de.lukas.kit.commands;

import de.lukas.kit.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Command_Role implements CommandExecutor {
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player)cs;
        FileConfiguration cfg = Main.getPlugin().getConfig();
        if (cmd.getName().equalsIgnoreCase("status"))
            if (args.length == 0) {
                p.sendMessage(ChatColor.GREEN + " Benutze " + ChatColor.WHITE + "/status <name> " + ChatColor.GREEN + "oder " + ChatColor.WHITE + "/status clear");
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("clear")) {
                    p.setDisplayName(null);
                    p.sendMessage(ChatColor.BLUE + " Dein Status wurde erfolgreich Zurückgesetzt");
                    return true;
                }
                String rolename = args[0];
                if (rolename.length() >= 12) {
                    p.sendMessage(ChatColor.BLUE + " Bitte unter 12 zeichen bleiben!");
                    return true;
                }
                rolename = ChatColor.translateAlternateColorCodes('&', rolename);
                cfg.set("Spielerliste." + p.getUniqueId().toString() + ".Status", rolename);
                Main.getPlugin().saveConfig();
                p.setDisplayName(String.valueOf(String.valueOf(rolename)) + ChatColor.WHITE + ">" + " <" + p.getName());
                p.sendMessage(ChatColor.BLUE + " Status gesetzt! " + ChatColor.WHITE + "<" + rolename + ChatColor.WHITE + ">" + " <" + p.getName() + ">");
            }
        return false;
    }
}
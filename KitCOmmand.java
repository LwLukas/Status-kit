package de.lukas.kit.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KitCOmmand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player){
            Player player =(Player)sender;
            if(args.length == 0){


                Inventory inventory = Bukkit.createInventory(null, 9*2,   "§cKit's");
                ItemStack item = new ItemStack(Material.GOLDEN_APPLE);
                ItemStack item2 = new ItemStack(Material.ENDER_CHEST);
                ItemStack item3 = new ItemStack(Material.MUSHROOM_SOUP);
                ItemStack item4 = new ItemStack(Material.ENDER_PEARL);

                ItemMeta itemMeta = item.getItemMeta();
                ItemMeta itemMeta2 = item2.getItemMeta();
                ItemMeta itemMeta3 = item3.getItemMeta();
                ItemMeta itemMeta4 = item4.getItemMeta();

                itemMeta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD + "UHC");
                itemMeta2.setDisplayName(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD + "DEFAULT");
                itemMeta3.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "SUPPER");
                itemMeta4.setDisplayName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Endermann");

                ArrayList<String> lore = new ArrayList<>();
                lore.add(" ");
                lore.add(ChatColor.GOLD + "Ausrüstung:");
                lore.add(ChatColor.GRAY + "-IRON_SWORD");
                lore.add(ChatColor.GRAY + "-IRON_HELMET");
                lore.add(ChatColor.GRAY + "-DIAMOND_CHESTPLATE");
                lore.add(ChatColor.GRAY + "-IRON_LEGGINGS");
                lore.add(ChatColor.GRAY + "-DIAMOND_BOOTS");
                lore.add(ChatColor.GRAY + "-BOW");
                lore.add(ChatColor.GRAY + "-ARROW");
                lore.add(ChatColor.GRAY + "-BREAD");



                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("");
                lore2.add(ChatColor.GOLD + "Ausrüstung:");
                lore2.add(ChatColor.GRAY + "-STONE_SWORD");
                lore2.add(ChatColor.GRAY + "-STONE_PICKAXE");
                lore2.add(ChatColor.GRAY + "-STONE_AXE");
                lore2.add(ChatColor.GRAY + "-LEATHER_HELMET");
                lore2.add(ChatColor.GRAY + "-LEATHER_CHESTPLATE");
                lore2.add(ChatColor.GRAY + "-LEATHER_LEGGINGS");
                lore2.add(ChatColor.GRAY + "-LEATHER_BOOTS");
                lore2.add(ChatColor.GRAY + "-BREAD");

                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("");
                lore3.add(ChatColor.GOLD + "Ausrüstung");
                lore3.add(ChatColor.GRAY + "-STONE_SWORD");
                lore3.add(ChatColor.GRAY + "-20xMUSHROOM_SOUP");




                itemMeta.setLore(lore);
                itemMeta2.setLore(lore2);
                itemMeta3.setLore(lore3);


                item.setItemMeta(itemMeta);
                item2.setItemMeta(itemMeta2);
                item3.setItemMeta(itemMeta3);
                item4.setItemMeta(itemMeta4);



                item.setAmount(1);
                item2.setAmount(1);
                item3.setAmount(1);
                item4.setAmount(1);
                inventory.setItem(1, item);
                inventory.setItem(0, item2);
                inventory.setItem(2, item3);
                inventory.setItem(3, item4);
                 player.openInventory(inventory);

            }


        }


        return false;
    }
}

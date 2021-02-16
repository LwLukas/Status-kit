package de.lukas.kit.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class InventoryClickEvent implements Listener {

    @EventHandler
    public void onClick(org.bukkit.event.inventory.InventoryClickEvent event) {
        Player p = (Player) event.getWhoClicked();



            if (event.getInventory().getName().equalsIgnoreCase("§cKit's")) {
                event.setCancelled(true);

                if (event.getCurrentItem().getType() == Material.GOLDEN_APPLE) {

                    p.getInventory().clear();
                    p.getInventory().setArmorContents(null);
                    p.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
                    p.getInventory().addItem(new ItemStack(Material.IRON_HELMET, 1));
                    p.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
                    p.getInventory().addItem(new ItemStack(Material.IRON_LEGGINGS, 1));
                    p.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1));
                    p.getInventory().addItem(new ItemStack(Material.BOW, 1));
                    p.getInventory().addItem(new ItemStack(Material.ARROW, 10));
                    p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
                    p.getInventory().addItem(new ItemStack(Material.BREAD, 32));




                    event.getView().close();

                    p.sendMessage(ChatColor.AQUA + "Du hast nun das UHC kit");


                }


            }




    }


}

package de.lukas.kit.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickIvent2 implements Listener {



    @EventHandler
    public void onClick(InventoryClickEvent event){
        Player p =(Player) event.getWhoClicked();


        if(event.getInventory().getName().equalsIgnoreCase("§cKit's")){
            event.setCancelled(true);

            if(event.getCurrentItem().getType() == Material.ENDER_CHEST){


                p.getInventory().clear();
                p.getInventory().setArmorContents(null);
                p.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
                p.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
                p.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
                p.getInventory().addItem(new ItemStack(Material.LEATHER_HELMET, 1));
                p.getInventory().addItem(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
                p.getInventory().addItem(new ItemStack(Material.LEATHER_LEGGINGS, 1));
                p.getInventory().addItem(new ItemStack(Material.LEATHER_BOOTS, 1));
                p.getInventory().addItem(new ItemStack(Material.BREAD, 32));

                event.getView().close();



            }

        }


    }


}

package de.lukas.kit.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InventoryClickEvent3 implements Listener {



    @EventHandler
    public void onClick(InventoryClickEvent event){
        Player p =(Player) event.getWhoClicked();


        if(event.getInventory().getName().equalsIgnoreCase("§cKit's")){
            event.setCancelled(true);

            if(event.getCurrentItem().getType() == Material.MUSHROOM_SOUP){





                p.getInventory().clear();
                p.getInventory().setArmorContents(null);
                p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));






                event.getView().close();



            }

        }


    }


}

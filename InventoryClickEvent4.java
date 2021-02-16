package de.lukas.kit.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InventoryClickEvent4 implements Listener {




    @EventHandler
    public void onClick(InventoryClickEvent event){
        Player p =(Player) event.getWhoClicked();


        if(event.getInventory().getName().equalsIgnoreCase("§cKit's")){
            event.setCancelled(true);

            if(event.getCurrentItem().getType() == Material.ENDER_PEARL){





                p.getInventory().clear();
                p.getInventory().setArmorContents(null);
                p.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
                p.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 2));

                p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 3));





                event.getView().close();



            }

        }


    }


}

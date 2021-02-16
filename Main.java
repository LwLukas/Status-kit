package de.lukas.kit;

import de.lukas.kit.commands.Command_Role;
import de.lukas.kit.commands.KitCOmmand;
import de.lukas.kit.listener.InventoryClickEvent;
import de.lukas.kit.listener.InventoryClickEvent3;
import de.lukas.kit.listener.InventoryClickEvent4;
import de.lukas.kit.listener.InventoryClickIvent2;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    static Main plugin;




    @Override
    public void onEnable() {
        plugin = this;
    commandregistartion();
    listenerregistration();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void commandregistartion(){
        getCommand("kit").setExecutor(new KitCOmmand());
        getCommand("status").setExecutor(new Command_Role());

       }
       public void listenerregistration(){
           PluginManager pluginManager = Bukkit.getPluginManager();

           pluginManager.registerEvents(new InventoryClickEvent(), this);
           pluginManager.registerEvents(new InventoryClickIvent2(), this);
           pluginManager.registerEvents(new InventoryClickEvent3(), this);
           pluginManager.registerEvents(new InventoryClickEvent4(), this);



       }

    public static Main getPlugin() {
        return plugin;
    }
}

package fr.silenthill99.bdd;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Le plugin est opérationnel !");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

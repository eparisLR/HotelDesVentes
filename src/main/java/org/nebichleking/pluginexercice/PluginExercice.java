package org.nebichleking.pluginexercice;

import org.bukkit.plugin.java.JavaPlugin;
import org.nebichleking.pluginexercice.commands.OpenGUICommand;

import java.util.Objects;

public final class PluginExercice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hôtel des ventes lancé !");
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Hôtel des ventes éteint !");
    }

    private void registerCommands() {
        Objects.requireNonNull(getCommand("hdv")).setExecutor(new OpenGUICommand());
        System.out.println("Commandes chargées");
    }
}

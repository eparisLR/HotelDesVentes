package org.nebichleking.pluginexercice.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class OpenGUICommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        Inventory inventory = Bukkit.createInventory((Player) commandSender, 54, "GUI");
        ((Player) commandSender).openInventory(inventory);
        return false;
    }
}

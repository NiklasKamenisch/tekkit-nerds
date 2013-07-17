package me.tekkitnerds.controlcenter;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class controlcenter extends JavaPlugin {
    @Override
    public void onDisable() {
        System.out.println("[TN-CC] deaktiviert");
    }
    
    @Override
    public void onEnable() {
        System.out.println("[TN-CC] aktiviert");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
        boolean erfolg = false;
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("status")){
            if (args.length == 0){
                p.sendMessage(ChatColor.GREEN + "Hier meine erste Nachricht");
                double leben = p.getHealth();
                p.sendMessage("Du hast "+leben+" Leben!");
                p.setHealth(10.0);
                erfolg = true;
            }
        }
        
        
        
        return erfolg;
    }
    
}

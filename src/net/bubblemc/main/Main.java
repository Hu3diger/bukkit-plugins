package net.bubblemc.main;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("[BubbleMC] " + ChatColor.GREEN + "Plugin enabled");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("[BubbleMC] " + ChatColor.RED + "Plugin disabled");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (command.getName().equalsIgnoreCase("bubblemc") && sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length > 0) {
				p.sendMessage(ChatColor.GOLD + "Hello " + p.getName() + "!!");
				p.sendMessage(ChatColor.GOLD + "You have found the easter egg number One of Thousand");
				p.sendTitle(ChatColor.AQUA + "Title", ChatColor.DARK_RED + "The author is very crazy", 10, 10, 10);
				p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_LAND, 10, 1);
				p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 100, 1);
			}
		}

		return true;
	}
}

package gr.kree.ben.experience;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Experience extends JavaPlugin {
	
	// Setup our logger.
	Logger logger;
	
	// Override for the standard activation method provided by Bukkit.
	public void onEnable() {
		registerAllEvents();
		logger = this.getLogger();
		logger.info("Experience mod has been enabled!.");
	}
	
	public void onDisable() {
		logger.info("Experience mod has been disabled.");
	}
	
	private void registerAllEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockListener(), this);
	}
	
}

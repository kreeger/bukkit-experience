package gr.kree.ben.experience;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Experience extends JavaPlugin {
	
	// Setup our logger.
	Logger logger;
	
	// Override for the standard activation method provided by Bukkit.
	public void onEnable() {
		logger = this.getLogger();
		logger.info("Your plugin has been enabled.");
	}
	
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerLogin(PlayerLoginEvent event) {
		
		
	}
	
	public void onDisable() {
		logger.info("Your plugin has now been disabled.");
	}
	
}

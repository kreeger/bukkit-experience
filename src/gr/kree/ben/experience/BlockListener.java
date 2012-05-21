package gr.kree.ben.experience;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {
	
	public static Experience plugin;
	private ArrayList<Material> validBlocks;
	
	public BlockListener(Experience instance) {
		plugin = instance;
		validBlocks = new ArrayList<Material>();
		validBlocks.add(Material.STONE);
		validBlocks.add(Material.WOOD);
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		Material material = block.getType();
		if (!validBlocks.contains(material)) return;
		
		// Debug line.
		String message = "Broke block " + material.toString();
		event.getPlayer().sendMessage(message);
		
		// Give us an orb.
		int amount = 10;
		//ExperienceOrb orb = spawnExperience(amount);
	}
	
//	private ExperienceOrb spawnExperience(int amount) {
//		Server server = plugin.getServer();
//		ExperienceOrb orb = new Entity<ExperienceOrb>();
//		orb.setExperience(amount);
//		return orb;
//	}
}

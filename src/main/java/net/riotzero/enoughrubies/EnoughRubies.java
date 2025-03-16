package net.riotzero.enoughrubies;

import net.fabricmc.api.ModInitializer;

import net.riotzero.enoughrubies.block.ModBlocks;
import net.riotzero.enoughrubies.item.ModItemGroups;
import net.riotzero.enoughrubies.item.ModItems;
import net.riotzero.enoughrubies.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnoughRubies implements ModInitializer {
	public static final String MOD_ID = "enoughrubies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}
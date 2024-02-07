package net.slyzoo.thekitchensink;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.ModItemGroups;
import net.slyzoo.thekitchensink.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thekitchensink implements ModInitializer {
	public static final String MOD_ID = "thekitchensink";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.CRUMPLED_PAPER, 200);
	}
}
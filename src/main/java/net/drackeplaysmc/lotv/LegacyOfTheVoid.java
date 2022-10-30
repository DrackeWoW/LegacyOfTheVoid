package net.drackeplaysmc.lotv;

import net.drackeplaysmc.lotv.block.ModBlocks;
import net.drackeplaysmc.lotv.item.ModItems;
import net.drackeplaysmc.lotv.util.ModLootTableModifiers;
import net.drackeplaysmc.lotv.util.ModRegistries;
import net.drackeplaysmc.lotv.world.dimension.ModDimensions;
import net.drackeplaysmc.lotv.world.feature.ModConfiguredFeatures;
import net.drackeplaysmc.lotv.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyOfTheVoid implements ModInitializer {
	public static final String MOD_ID = "lotv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModRegistries.registerModStuffs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModOreGeneration.generateOres();
		ModDimensions.registerDimensions();

	}
}

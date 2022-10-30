package net.drackeplaysmc.lotv.world.feature;

import net.drackeplaysmc.lotv.LegacyOfTheVoid;
import net.drackeplaysmc.lotv.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_VOID_INFESTED_STONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.VOID_INFESTED_DEEPSLATE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_VOID_INFESTED_STONE = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.VOID_INFSTED_END_STONE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOID_INFESTED_DEEPSLATE =
            ConfiguredFeatures.register("void_infested_deepslate", Feature.ORE, new OreFeatureConfig(OVERWORLD_VOID_INFESTED_STONE, 5));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOID_INFESTED_END_STONE =
            ConfiguredFeatures.register("end_void_infested_stone", Feature.ORE, new OreFeatureConfig(END_VOID_INFESTED_STONE, 8));

    public static void registerConfiguredFeatures() {
        LegacyOfTheVoid.LOGGER.debug("Registering the ModConfiguredFeatures for " + LegacyOfTheVoid.MOD_ID);
    }
}

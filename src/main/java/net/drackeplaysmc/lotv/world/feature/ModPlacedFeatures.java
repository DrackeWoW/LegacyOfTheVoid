package net.drackeplaysmc.lotv.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> VOID_INFESTED_DEEPSLATE_PLACED = PlacedFeatures.register("void_infested_deepslate_placed",
            ModConfiguredFeatures.VOID_INFESTED_DEEPSLATE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(30))));

    public static final RegistryEntry<PlacedFeature> VOID_INFESTED_END_STONE_PLACED = PlacedFeatures.register("void_infested_end_stone_placed",
            ModConfiguredFeatures.VOID_INFESTED_END_STONE, modifiersWithCount(12,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(30))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}

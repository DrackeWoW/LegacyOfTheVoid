package net.drackeplaysmc.lotv.world.dimension;

import net.drackeplaysmc.lotv.LegacyOfTheVoid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;



public class ModDimensions {
    /*
        Void Dimension
            Biomes: Scorched Plains, Whispering Woods, Mortalis Wastes
            Dimensionwide Structures:
                Mortalis Outpost
                Crystal Cluster
                Floating Island
                Void Skyship

    */
    public static final RegistryKey<World> THE_VOID_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(LegacyOfTheVoid.MOD_ID, "the_void"));
    public static final RegistryKey<DimensionType> THE_VOID_TYPE_KEY = RegistryKey
            .of(Registry.DIMENSION_TYPE_KEY, THE_VOID_DIMENSION_KEY.getValue());


    public static void registerDimensions() {
        LegacyOfTheVoid.LOGGER.debug("Registering ModDimensions for "+LegacyOfTheVoid.MOD_ID);
    }
}

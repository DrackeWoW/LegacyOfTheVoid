package net.drackeplaysmc.lotv.util;

import net.drackeplaysmc.lotv.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFlammableBlocks();
    }


    private static void registerFlammableBlocks() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.WITHERBARK_LOG, 10, 15);
        instance.add(ModBlocks.STRIPPED_WITHERBARK_LOG, 10, 15);
        instance.add(ModBlocks.WITHERBARK_WOOD, 10, 15);
        instance.add(ModBlocks.STRIPPED_WITHERBARK_WOOD, 10, 15);
        instance.add(ModBlocks.WITHERBARK_PLANKS, 10, 20);
    }
}

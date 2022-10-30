package net.drackeplaysmc.lotv.util;

import net.drackeplaysmc.lotv.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier DUNGEON_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier ANCIENT_CITY_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier STRONGHOLD_CORRIDOR_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier BASTION_TREASURE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BASTION_BRIDGE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier BASTION_HOGLIN_STABLE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier BASTION_OTHER_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_other");

    private static final Identifier END_CITY_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier NETHER_BRIDGE_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/nether_bridge");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(DUNGEON_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.025f)) //2.5% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(ANCIENT_CITY_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f)) //33% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(STRONGHOLD_CORRIDOR_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) //5% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(STRONGHOLD_CROSSING_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) //5% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_TREASURE_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_BRIDGE_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_HOGLIN_STABLE_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(NETHER_BRIDGE_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) //5% chance to contain
                        .with(ItemEntry.builder(ModItems.BROKEN_HERO_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        }));
    }
}

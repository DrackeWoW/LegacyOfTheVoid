package net.drackeplaysmc.lotv.item;

import net.drackeplaysmc.lotv.LegacyOfTheVoid;
import net.drackeplaysmc.lotv.item.armory.armor.ModArmorMaterials;
import net.drackeplaysmc.lotv.item.armory.toolandweapon.*;
import net.drackeplaysmc.lotv.item.custom.OrbOfMadnessItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item REINFORCED_LEATHER = registerItem("reinforced_leather", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VOID_STONE = registerItem("void_stone", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VOID_CRYSTAL_FRAGMENT = registerItem("void_crystal_fragment", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SOUL_FRAGMENT = registerItem("soul_fragment", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CORSPE_WASP_STINGER = registerItem("corpse_wasp_stinger", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    //Void Crystal
    //Soul Fragment
    //Soul Stone
    //Blood Stone
    //Corpse Wasp Stinger
    //Bucket of Corpse Wasp Acid
    //Bucket of Tar

    public static final Item HOLLOW_SOUL = registerItem("hollow_soul", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VALOROUS_SOUL_FRAGMENT = registerItem("valorous_soul_fragment", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TORMENTED_SOUL_FRAGMENT = registerItem("tormented_soul_fragment", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item SOULSTEEL_INGOT = registerItem("soulsteel_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VALOROUS_SOULSTEEL = registerItem("valorous_soulsteel", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TORMENTED_SOULSTEEL = registerItem("tormented_soulsteel", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REFINED_VALOROUS_SOULSTEEL = registerItem("refined_valorous_soulsteel", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REFINED_TORMENTED_SOULSTEEL = registerItem("refined_tormented_soulsteel", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item BROKEN_HERO_SWORD = registerItem("broken_hero_sword", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(1)));
    public static final Item JUSTICE = registerItem("justice", new JusticeSwordBase(new JusticeToolMaterial()));
    public static final Item VENGEANCE = registerItem("vengeance", new VengeanceSwordBase(new VengeanceToolMaterial()));

    public static final Item SOULSTEEL_DAGGER = registerItem("soulsteel_dagger",
            new SwordItem(ModToolMaterials.VOID_STONE, 5, 10f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
    public static final Item SOULSTEEL_SWORD = registerItem("soulsteel_sword",
            new SwordItem(ModToolMaterials.VOID_STONE, 10, 5f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
    public static final Item SOULSTEEL_BATTLEAXE = registerItem("soulsteel_battleaxe",
            new ModBattleAxeItem(ModToolMaterials.VOID_STONE, 20, 0.8f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
    public static final Item SOULSTEEL_PICKAXE = registerItem("soulsteel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.VOID_STONE, 2, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item SOULSTEEL_AXE = registerItem("soulsteel_axe",
            new ModPickaxeItem(ModToolMaterials.VOID_STONE, 7, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item SOULSTEEL_SHOVEL = registerItem("soulsteel_shovel",
            new ModPickaxeItem(ModToolMaterials.VOID_STONE, 1, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item SOULSTEEL_HOE = registerItem("soulsteel_hoe",
            new ModHoeItem(ModToolMaterials.VOID_STONE, 0, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture

    public static final Item ORB_OF_MADNESS = registerItem("orb_of_madness", new OrbOfMadnessItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MINING_GOGGLES = registerItem("mining_goggles", new ArmorItem(ModArmorMaterials.EXPLORER, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT))); //json classes and texture
    public static final Item MINING_JACKET = registerItem("mining_goggles", new ArmorItem(ModArmorMaterials.EXPLORER, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT))); //json classes and texture

    public static final Item VOID_STONE_HELMET = registerItem("void_stone_helmet", new ArmorItem(ModArmorMaterials.VOID_STONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item VOID_STONE_CHESTPLATE = registerItem("void_stone_chestplate", new ArmorItem(ModArmorMaterials.VOID_STONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item VOID_STONE_LEGGUARDS = registerItem("void_stone_legguards", new ArmorItem(ModArmorMaterials.VOID_STONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item VOID_STONE_BOOTS = registerItem("void_stone_boots", new ArmorItem(ModArmorMaterials.VOID_STONE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

   public static final Item VOID_STONE_DAGGER = registerItem("void_stone_dagger",
           new SwordItem(ModToolMaterials.VOID_STONE, 5, 10f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
   public static final Item VOID_STONE_SWORD = registerItem("void_stone_sword",
           new SwordItem(ModToolMaterials.VOID_STONE, 10, 5f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
   public static final Item VOID_STONE_BATTLEAXE = registerItem("void_stone_battleaxe",
           new ModBattleAxeItem(ModToolMaterials.VOID_STONE, 20, 0.8f, new FabricItemSettings().group(ItemGroup.COMBAT))); //json files and texture
   public static final Item VOID_STONE_PICKAXE = registerItem("void_stone_pickaxe",
           new ModPickaxeItem(ModToolMaterials.VOID_STONE, 2, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item VOID_STONE_AXE = registerItem("void_stone_axe",
            new ModPickaxeItem(ModToolMaterials.VOID_STONE, 7, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item VOID_STONE_SHOVEL = registerItem("void_stone_shovel",
            new ModPickaxeItem(ModToolMaterials.VOID_STONE, 1, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    public static final Item VOID_STONE_HOE = registerItem("void_stone_hoe",
            new ModHoeItem(ModToolMaterials.VOID_STONE, 0, 0f, new FabricItemSettings().group(ItemGroup.TOOLS))); //json files and texture
    //Void Stone Guillotine
    //Void Stone Cleaver
    //Void Stone Pickaxe
    //Void Stone Axe
    //Void Stone Shovel
    //Void Stone Hoe
    //Void Stone Bow

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyOfTheVoid.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LegacyOfTheVoid.LOGGER.debug("Registering Mod Items for " + LegacyOfTheVoid.MOD_ID);
    }
}

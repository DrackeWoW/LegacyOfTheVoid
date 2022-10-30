package net.drackeplaysmc.lotv.block;

import net.drackeplaysmc.lotv.LegacyOfTheVoid;
import net.drackeplaysmc.lotv.block.custom.GraveStoneBlock;
import net.drackeplaysmc.lotv.block.custom.ModStairsBlock;
import net.drackeplaysmc.lotv.block.custom.OrbOfMadnessHolderBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {



    //Scorched Plains/Scorched Valley

    public static final Block SCORCHED_SHADE_SOIL = registerBlock("scorched_shade_soil", new GrassBlock(FabricBlockSettings
            .copy(Blocks.GRASS_BLOCK).strength(3.0f, 7.0f).sounds(BlockSoundGroup.MUD_BRICKS).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    //Corpse Wasp Hive
    //Corpse Wasp Nest
    //Corpse Wast Nest Part
    public static final Block CORPSE_WASP_NEST_PART = registerBlock("corpse_wasp_nest_part", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(5.0f, 8.0f).sounds(BlockSoundGroup.HANGING_ROOTS).requiresTool()), ItemGroup.BUILDING_BLOCKS); //add json Files

    //Shade Stone
    public static final Block BLEACHED_SHADE_STONE = registerBlock("bleached_shade_stone", new Block(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(1.2f, 7.5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLEACHED_SHADE_STONE_STAIRS = registerBlock("bleached_shade_stone_stairs", new ModStairsBlock(ModBlocks.BLEACHED_SHADE_STONE.getDefaultState(), FabricBlockSettings
            .of(Material.STONE).strength(1.2f, 7.5f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block BLEACHED_SHADE_STONE_SLAB = registerBlock("bleached_shade_stone_slab", new SlabBlock(FabricBlockSettings
            .of(Material.STONE).strength(1.2f, 7.5f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block BLEACHED_SHADE_STONE_WALL = registerBlock("bleached_shade_stone_wall", new WallBlock(FabricBlockSettings
            .copy(ModBlocks.BLEACHED_SHADE_STONE_SLAB)), ItemGroup.DECORATIONS); //json files and texture
    //Shade Stone Wall
    public static final Block BLEACHED_SHADE_STONE_BRICKS = registerBlock("bleached_shade_stone_bricks", new Block(FabricBlockSettings
            .of(Material.STONE).strength(3.5f, 9f).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block BLEACHED_SHADE_STONE_BRICK_STAIRS = registerBlock("bleached_shade_stone_brick_stairs", new ModStairsBlock(ModBlocks.BLEACHED_SHADE_STONE_BRICKS.getDefaultState(), FabricBlockSettings
            .of(Material.STONE).strength(3.5f, 9f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block BLEACHED_SHADE_STONE_BRICK_SLAB = registerBlock("bleached_shade_stone_brick_slab", new SlabBlock(FabricBlockSettings
            .of(Material.STONE).strength(3.5f, 9f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block BLEACHED_SHADE_STONE_BRICK_WALL = registerBlock("bleached_shade_stone_brick_wall", new WallBlock(FabricBlockSettings
            .copy(ModBlocks.BLEACHED_SHADE_STONE_BRICK_SLAB)), ItemGroup.DECORATIONS); //json files and texture

    //Bleached Void Crystal
    public static final Block BLEACHED_VOID_CRYSTAL_BLOCK = registerBlock("bleached_void_crystal_block", new GlassBlock(FabricBlockSettings
            .copy(Blocks.GLASS).strength(5.0f, 9.0f).requiresTool().luminance(state -> 15).nonOpaque()), ItemGroup.BUILDING_BLOCKS); //Add json Files

    public static final Block ASH_LOG = registerBlock("ash_log", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_LOG).strength(2.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block STRIPPED_ASH_LOG = registerBlock("stripped_ash_log", new PillarBlock(FabricBlockSettings
            .copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block ASH_WOOD = registerBlock("ash_wood", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_WOOD).strength(2.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood", new PillarBlock(FabricBlockSettings
            .copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block ASH_LEAVES = registerBlock("ash_leaves", new GlassBlock(FabricBlockSettings
            .copy(Blocks.ACACIA_LEAVES).nonOpaque()), ItemGroup.BUILDING_BLOCKS); //Add json Files

    public static final Block ASH_PLANKS = registerBlock("ash_planks", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS).strength(2.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block ASH_STAIRS = registerBlock("ash_stairs", new ModStairsBlock(ModBlocks.ASH_PLANKS.getDefaultState(), FabricBlockSettings
            .of(Material.WOOD).strength(2.0f, 6.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block ASH_SLAB = registerBlock("ash_slab", new SlabBlock(FabricBlockSettings
            .of(Material.WOOD).strength(4.0f, 15.0f)), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block ASH_FENCE = registerBlock("ash_fence", new FenceBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS); //Add json Files
    public static final Block ASH_FENCE_GATE = registerBlock("ash_fence_gate", new FenceGateBlock(FabricBlockSettings
            .copy(ModBlocks.ASH_FENCE)), ItemGroup.BUILDING_BLOCKS); //Add json Files

    //Corpse Wasp Acid Liquid


    //Whispering Woods
    public static final Block SHADE_SOIL = registerBlock("shade_soil", new GrassBlock(FabricBlockSettings
            .copy(Blocks.GRASS_BLOCK).strength(3.0f, 7.0f).sounds(BlockSoundGroup.CORAL).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    //Witherbark
    public static final Block WITHERBARK_LOG = registerBlock("witherbark_log", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_LOG).strength(3.0f, 6.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_WITHERBARK_LOG = registerBlock("stripped_witherbark_log", new PillarBlock(FabricBlockSettings
            .copy(Blocks.STRIPPED_OAK_LOG).strength(3.0f, 6.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WITHERBARK_WOOD = registerBlock("witherbark_wood", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_WOOD).strength(3.0f, 6.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_WITHERBARK_WOOD = registerBlock("stripped_witherbark_wood", new PillarBlock(FabricBlockSettings
            .copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f, 6.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WITHERBARK_LEAVES = registerBlock("witherbark_leaves", new GlassBlock(FabricBlockSettings
            .copy(Blocks.OAK_LEAVES).requiresTool().nonOpaque()), ItemGroup.BUILDING_BLOCKS); //Add json Files

    public static final Block WITHERBARK_PLANKS = registerBlock("witherbark_planks", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS).strength(3.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WITHERBARK_STAIRS = registerBlock("witherpbark_stairs", new ModStairsBlock(ModBlocks.WITHERBARK_PLANKS.getDefaultState(), FabricBlockSettings
            .of(Material.WOOD).strength(3.0f, 6.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block WITHERBARK_SLAB = registerBlock("witherbark_slab", new SlabBlock(FabricBlockSettings
            .of(Material.WOOD).strength(4.0f, 15.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //add json Files
    public static final Block WITHERBARK_FENCE = registerBlock("ash_fence", new FenceBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS); //Add json Files
    public static final Block WITHERBARK_FENCE_GATE = registerBlock("ash_fence_gate", new FenceGateBlock(FabricBlockSettings
            .copy(ModBlocks.ASH_FENCE)), ItemGroup.BUILDING_BLOCKS); //Add json Files

    //Witherbark Sapling

    //Witherbark Plank Door
    //Witherbark Plank Trapdoor

    //Corpse Bloom
    //Void Crystal
    public static final Block VOID_CRYSTAL_BLOCK = registerBlock("void_crystal_block", new GlassBlock(FabricBlockSettings
            .copy(Blocks.GLASS).strength(5.0f, 9.0f).requiresTool().luminance(state -> 5).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    //Tar Liquid
    //Sprite Light/Glow Fruit/Glow Fly

    //Mortalis

    //Void Crystal Light Sources
    public static final Block VOID_CRYSTAL_TORCH = registerBlock("void_crystal_torch", new TorchBlock(FabricBlockSettings
            .of(Material.DECORATION).noCollision().breakInstantly().luminance(state -> 5).sounds(BlockSoundGroup.AMETHYST_CLUSTER), ParticleTypes.END_ROD), ItemGroup.DECORATIONS); //json files and texture
    public static final Block VOID_CRYSTAL_WALL_TORCH = registerBlock("void_crystal_wall_torch", new WallTorchBlock(FabricBlockSettings
            .of(Material.DECORATION).noCollision().breakInstantly().luminance(state -> 5).sounds(BlockSoundGroup.AMETHYST_CLUSTER).dropsLike(VOID_CRYSTAL_TORCH), ParticleTypes.FALLING_OBSIDIAN_TEAR),ItemGroup.DECORATIONS); //json files and texture
    public static final Block VOID_CRYSTAL_LANTERN = registerBlock("void_crystal_lantern", new LanternBlock(FabricBlockSettings
            .of(Material.METAL).requiresTool().strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 5).nonOpaque()), ItemGroup.DECORATIONS); //json files and texture


    //Shade Stone
    public static final Block SHADE_STONE = registerBlock("shade_stone", new Block(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(1.5f, 9.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SHADE_STONE_STAIRS = registerBlock("shade_stone_stairs", new ModStairsBlock(ModBlocks.SHADE_STONE.getDefaultState(), FabricBlockSettings
            .of(Material.STONE).strength(1.5f, 15.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block SHADE_STONE_SLAB = registerBlock("shade_stone_slab", new SlabBlock(FabricBlockSettings
            .of(Material.STONE).strength(1.5f, 15.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS); //Add json Files
    public static final Block SHADE_STONE_WALL = registerBlock("shade_stone_wall", new WallBlock(FabricBlockSettings.copy(ModBlocks.SHADE_STONE_SLAB)), ItemGroup.DECORATIONS); //json files and texture

    public static final Block SHADE_STONE_BRICKS = registerBlock("shade_stone_bricks", new Block(FabricBlockSettings
            .of(Material.STONE).strength(4.0f, 15.0f).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SHADE_STONE_BRICK_STAIRS = registerBlock("shade_stone_brick_stairs", new ModStairsBlock(ModBlocks.SHADE_STONE_BRICKS.getDefaultState(), FabricBlockSettings
            .of(Material.STONE).strength(4.0f, 15.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SHADE_STONE_BRICK_SLAB = registerBlock("shade_stone_brick_slab", new SlabBlock(FabricBlockSettings
            .of(Material.STONE).strength(4.0f, 15.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SHADE_STONE_BRICK_WALL = registerBlock("shade_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(ModBlocks.SHADE_STONE_BRICK_SLAB)), ItemGroup.DECORATIONS); //json files and texture

    //Shaded Iron Ore
    public static final Block SHADED_IRON_ORE = registerBlock("shaded_iron_ore", new OreBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(3.0f, 9.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS), UniformIntProvider.create(6, 14)), ItemGroup.BUILDING_BLOCKS);//json files and texture

    //Block of Void Stone


    //Void Stone Ore
    public static final Block VOID_INFESTED_DEEPSLATE = registerBlock("void_infested_deepslate", new OreBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(6.0f, 1800f).sounds(BlockSoundGroup.AMETHYST_BLOCK), UniformIntProvider.create(6, 14)), ItemGroup.BUILDING_BLOCKS);
    public static final Block VOID_INFSTED_END_STONE = registerBlock("void_infested_end_stone", new OreBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(6.0f, 1800f).sounds(BlockSoundGroup.AMETHYST_BLOCK), UniformIntProvider.create(6, 14)), ItemGroup.BUILDING_BLOCKS);
    public static final Block VOID_STONE_ORE = registerBlock("void_stone_ore", new OreBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(7.0f, 1800f).sounds(BlockSoundGroup.AMETHYST_BLOCK), UniformIntProvider.create(6, 14)), ItemGroup.BUILDING_BLOCKS);


    //Utility Blocks
    public static final Block VOID_PORTAL_FRAME = registerBlock("void_portal_frame", new Block(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(45.0f, 1800f).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block VALOROUS_SOULSTEEL_BLOCK = registerBlock("valorous_soulsteel_block", new Block(FabricBlockSettings
            .of(Material.METAL).requiresTool().strength(6.0f, 9f).sounds(BlockSoundGroup.COPPER).velocityMultiplier(2.0f).jumpVelocityMultiplier(3.0f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block TORMENTED_SOULSTEEL_BLOCK = registerBlock("tormented_soulsteel_block", new Block(FabricBlockSettings
            .of(Material.METAL).requiresTool().strength(6.0f, 9f).sounds(BlockSoundGroup.COPPER).velocityMultiplier(0.5f).jumpVelocityMultiplier(0.3f)), ItemGroup.BUILDING_BLOCKS);
    //Void Altar
    //Soul Forge

    //Custom Blocks
    //Crystal Ball Holder
    public static final Block ORB_OF_MADNESS_HOLDER = registerBlock("orb_of_madness_holder", new OrbOfMadnessHolderBlock(FabricBlockSettings
            .of(Material.METAL).nonOpaque().requiresTool().strength(15.0f, 15.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)), ItemGroup.DECORATIONS);
    public static final Block GRAVE_STONE = registerBlock("grave_stone", new GraveStoneBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().nonOpaque().strength(4.0f, 7.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block WEATHERED_GRAVE_STONE = registerBlock("weathered_grave_stone", new GraveStoneBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().nonOpaque().strength(4.0f, 7.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SHATTERED_GRAVE_STONE = registerBlock("shattered_grave_stone", new GraveStoneBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().nonOpaque().strength(4.0f, 7.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block VOID_INFESTED_GRAVE_STONE = registerBlock("void_infested_grave_stone", new GraveStoneBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().nonOpaque().strength(4.0f, 7.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    //Void Stone Spike Trap
    //Caltrops



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(LegacyOfTheVoid.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyOfTheVoid.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        LegacyOfTheVoid.LOGGER.debug("Registering Mod Blocks for " + LegacyOfTheVoid.MOD_ID);
    }
}

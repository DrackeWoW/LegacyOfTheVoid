package net.drackeplaysmc.lotv.item.armory.toolandweapon;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class ModBattleAxeItem extends SwordItem {
    public ModBattleAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.isIn(BlockTags.AXE_MINEABLE)) {
            return 15.0f;
        }
        Material material = state.getMaterial();
        if (material == Material.PLANT || material == Material.REPLACEABLE_PLANT || state.isIn(BlockTags.LEAVES) || material == Material.GOURD) {
            return 1.5f;
        }
        return 1.0f;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.isIn(BlockTags.AXE_MINEABLE);
    }
}

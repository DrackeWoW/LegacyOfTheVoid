package net.drackeplaysmc.lotv.item.armory.toolandweapon;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class JusticeToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 10000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public float getAttackDamage() {
        return 33;
    }

    @Override
    public int getMiningLevel() {
        return 20;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

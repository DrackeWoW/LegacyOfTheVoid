package net.drackeplaysmc.lotv.item.armory.toolandweapon;


import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class VengeanceSwordBase extends SwordItem {
    public VengeanceSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, -2.5f, new Settings().group(ItemGroup.COMBAT));
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.lotv.vengeance.tooltip"));
        tooltip.add(Text.translatable("item.lotv.vengeance.tooltip2"));
        tooltip.add(Text.translatable("item.lotv.vengeance.tooltip3"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity enemy, LivingEntity wielder) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        //Relentless Pursuit
        StatusEffectInstance strength = new StatusEffectInstance(StatusEffect.byRawId(5), 100, 4, false, false, true);
        StatusEffectInstance haste = new StatusEffectInstance(StatusEffect.byRawId(3), 100, 4, false, false, false);
        StatusEffectInstance speed = new StatusEffectInstance(StatusEffect.byRawId(1), 100, 2, false, false, false);
        //Leeching
        StatusEffectInstance absorbtion = new StatusEffectInstance(StatusEffect.byRawId(22), 150, 2, false, false, false);
        StatusEffectInstance withering = new StatusEffectInstance(StatusEffect.byRawId(20), 100, 4, false, true, false);
        //Consume Host
        StatusEffectInstance withering_consumption = new StatusEffectInstance(StatusEffect.byRawId(20), 100, 4, false, false, false);
        StatusEffectInstance hunger = new StatusEffectInstance(StatusEffect.byRawId(17), 50, 1, false, false, true);
        itemStack_1.damage(1, wielder, (p) -> p.sendToolBreakStatus(p.getActiveHand()));

        switch (randomNumber) {
            case 0:
                wielder.addStatusEffect(strength);
                wielder.addStatusEffect(haste);
                wielder.addStatusEffect(speed);
                return true;
            case 1:
                wielder.addStatusEffect(absorbtion);
                enemy.addStatusEffect(withering);

            case 2:
                wielder.addStatusEffect(withering_consumption);
                wielder.addStatusEffect(hunger);
            default:
                return true;
        }
    }

}

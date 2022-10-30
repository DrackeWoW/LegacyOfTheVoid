package net.drackeplaysmc.lotv.item.armory.toolandweapon;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class JusticeSwordBase extends SwordItem {
    public JusticeSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, -1.75f, new Settings().group(ItemGroup.COMBAT));
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.lotv.justice.tooltip"));
        tooltip.add(Text.translatable("item.lotv.justice.tooltip2"));
        tooltip.add(Text.translatable("item.lotv.justice.tooltip3"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity enemy, LivingEntity wielder) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        //Invigoration
        StatusEffectInstance regeneration = new StatusEffectInstance(StatusEffect.byRawId(10), 100, 4, false, false, true);
        StatusEffectInstance saturation = new StatusEffectInstance(StatusEffect.byRawId(23), 20, 2, false, false, false);
        StatusEffectInstance hero = new StatusEffectInstance(StatusEffect.byRawId(32), 1000, 4, false, false, false);
        //Smite
        StatusEffectInstance blindness = new StatusEffectInstance(StatusEffect.byRawId(15), 150, 2, false, true, false);
        StatusEffectInstance weakness = new StatusEffectInstance(StatusEffect.byRawId(18), 150, 4, false, false,false);
        StatusEffectInstance slowness = new StatusEffectInstance(StatusEffect.byRawId(2), 150, 4, false, false, false);
        itemStack_1.damage(1, wielder, (p) -> p.sendToolBreakStatus(p.getActiveHand()));

        switch (randomNumber) {
            case 0:
                wielder.addStatusEffect(regeneration);
                wielder.addStatusEffect(saturation);
                wielder.addStatusEffect(hero);
                return true;
            case 1:
                enemy.addStatusEffect(blindness);
                enemy.addStatusEffect(weakness);
                enemy.addStatusEffect(slowness);
            default:
                return true;
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        //Angelic Bulwark
        StatusEffectInstance resistance = new StatusEffectInstance(StatusEffect.byRawId(11), 100, 100, false, true, true);
        StatusEffectInstance regeneration = new StatusEffectInstance(StatusEffect.byRawId(10), 50, 9, false, true, true);
        playerEntity.addStatusEffect(regeneration);
        playerEntity.addStatusEffect(resistance);
        playerEntity.getItemCooldownManager().set(this, 500);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}

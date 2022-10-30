package net.drackeplaysmc.lotv.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.List;

public class OrbOfMadnessItem extends Item {
    public OrbOfMadnessItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            outPutRandomMessage(user);
            user.getItemCooldownManager().set(this, 100);
        }

        return super.use(world, user, hand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.lotv.orb_of_madness.tooltip"));
    }
    private void outPutRandomMessage(PlayerEntity player) {
        int randomNum = getRandomNumber();
        if(randomNum == 0) {
            player.sendMessage(Text.translatable("item.lotv.orb_of_madness.message1"));
        }
        if(randomNum == 1) {
            player.sendMessage(Text.translatable("item.lotv.orb_of_madness.message2"));
        }
        if(randomNum == 2) {
            player.sendMessage(Text.translatable("item.lotv.orb_of_madness.message3"));
        }
        if(randomNum == 3) {
            player.sendMessage(Text.translatable("item.lotv.orb_of_madness.message4"));
        }
    }

    private int getRandomNumber() {
        return Random.createLocal().nextInt(4);
    }
}
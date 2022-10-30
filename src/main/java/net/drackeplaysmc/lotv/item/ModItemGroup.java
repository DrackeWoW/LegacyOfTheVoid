package net.drackeplaysmc.lotv.item;

import net.drackeplaysmc.lotv.LegacyOfTheVoid;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup VOID_STONE = FabricItemGroupBuilder.build(new Identifier(LegacyOfTheVoid.MOD_ID, "void_stone"), () -> new ItemStack(ModItems.VOID_STONE));
}

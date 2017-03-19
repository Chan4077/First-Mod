package com.edricchan.firstmod.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {
	public static void init() {
		GameRegistry.addSmelting(BlockHandler.blockCheese, new ItemStack(ItemHandler.foodCheese), 1.0F);
	}
}

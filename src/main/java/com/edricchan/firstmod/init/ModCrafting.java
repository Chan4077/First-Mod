package com.edricchan.firstmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		// 9 Cheese -> Cheese Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheese_block), "CCC", "CCC", "CCC", 'C', ModFoods.cheese);
		// Cheese Block -> 9 Cheese
		GameRegistry.addShapelessRecipe(new ItemStack(ModFoods.cheese, 9), ModBlocks.cheese_block);
		// Diamond + Red dye -> Ruby
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby), new ItemStack(Items.DYE, 1, 1), Items.DIAMOND);
		// 9 Ruby -> Ruby Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ruby_block), "RRR", "RRR", "RRR", 'R', ModItems.ruby);
		// Ruby Block -> 9 Ruby
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9), ModBlocks.ruby_block);
		// Cheese + Cookie -> Cheese Cookie
		GameRegistry.addShapelessRecipe(new ItemStack(ModFoods.cheese_and_cookie, 2), ModFoods.cheese, Items.COOKIE);
		// Command Block
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COMMAND_BLOCK), "RGR", "INI", "RGR", 'R', Items.REDSTONE, 'G', Items.GOLD_INGOT, 'N', Items.NETHER_STAR, 'I', Items.IRON_INGOT);
		// Smelting

	}
}

package com.edricchan.firstmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		// 9 Cheese -> Cheese Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CHEESE_BLOCK), "CCC", "CCC", "CCC", 'C', ModFoods.CHEESE);
		// Cheese Block -> 9 Cheese
		GameRegistry.addShapelessRecipe(new ItemStack(ModFoods.CHEESE, 9), ModBlocks.CHEESE_BLOCK);
		// Diamond + Red dye -> Ruby
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RUBY), new ItemStack(Items.DYE, 1, 1), Items.DIAMOND);
		// 9 Ruby -> Ruby Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.RUBY_BLOCK), "RRR", "RRR", "RRR", 'R', ModItems.RUBY);
		// Ruby Block -> 9 Ruby
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RUBY, 9), ModBlocks.RUBY_BLOCK);
		// Cheese + Cookie -> Cheese Cookie
		GameRegistry.addShapelessRecipe(new ItemStack(ModFoods.CHEESE_AND_COOKIE, 2), ModFoods.CHEESE, Items.COOKIE);
		// Command Block
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COMMAND_BLOCK), "RGR", "INI", "RGR", 'R', Items.REDSTONE, 'G', Items.GOLD_INGOT, 'N', Items.NETHER_STAR, 'I', Items.IRON_INGOT);
		// Smelting

	}
}

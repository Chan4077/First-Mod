package com.edricchan.firstmod.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.foodCheeseCookie), new Object[] {Items.COOKIE, ItemHandler.foodCheese});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.foodCheese, 9), BlockHandler.blockCheese);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockCheese), new ItemStack(ItemHandler.foodCheese, 9));
		// Letter blocks
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterA), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterA});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterB), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterB});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterC), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterC});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterD), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterD});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterE), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterE});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterF), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterF});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterG), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterG});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterH), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterH});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterI), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterI});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterJ), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterJ});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterK), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterK});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterL), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterL});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterM), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterM});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterN), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterN});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterO), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterO});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterP), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterP});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterQ), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterQ});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterR), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterR});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterS), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterS});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterT), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterT});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterU), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterU});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterV), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterV});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterW), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterW});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterX), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterX});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterY), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterY});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.blockLetterZ), new Object[] {BlockHandler.blockLetterOrange, ItemHandler.itemLetterZ});
	}
}

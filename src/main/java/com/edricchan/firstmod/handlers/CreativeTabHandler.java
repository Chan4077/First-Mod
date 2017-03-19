package com.edricchan.firstmod.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	public static CreativeTabs tabBlocks = new CreativeTabs("first_blocks") {

		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(BlockHandler.blockCheese));
		}
	};
	public static CreativeTabs tabLetterBlocks = new CreativeTabs("first_letter_blocks") {
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockHandler.blockLetterA);
		}
	};
	public static CreativeTabs tabLetters = new CreativeTabs("first_letters") {
		
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.itemLetterA);
		}
	};
	public static CreativeTabs tabFoods = new CreativeTabs("first_foods") {
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.foodCheese);
		}
	};
	public static CreativeTabs tabItems = new CreativeTabs("first_items") {
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.itemRuby);
		}
	};
}

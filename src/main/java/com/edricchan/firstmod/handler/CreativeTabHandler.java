package com.edricchan.firstmod.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	/**
	 * Creative tab for first mod block
	 */
	public static CreativeTabs tabBlocks = new CreativeTabs("first_blocks") {

		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ModBlocks.blockSimple));
		}
	};
//	public static CreativeTabs tabLetterBlocks = new CreativeTabs("first_letter_blocks") {
//		public ItemStack getTabIconItem() {
//			return new ItemStack(ModBlocks.blockLetterA);
//		}
//	};
//	public static CreativeTabs tabLetters = new CreativeTabs("first_letters") {
//		
//		public ItemStack getTabIconItem() {
//			return new ItemStack(ItemHandler.itemLetterA);
//		}
//	};
	/**
	 * Creative tab for first mod block
	 */
	public static CreativeTabs tabFoods = new CreativeTabs("first_foods") {
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.foodCheese);
		}
	};
	/**
	 * Creative tab for first mod block
	 */
	public static CreativeTabs tabItems = new CreativeTabs("first_items") {
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.itemRuby);
		}
	};
}

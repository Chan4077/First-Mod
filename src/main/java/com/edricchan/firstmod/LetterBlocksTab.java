package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModLetterBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LetterBlocksTab extends CreativeTabs {

	public LetterBlocksTab() {
		super("letterBlocksTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModLetterBlocks.LETTER_A_ORANGE);
	}
	
}

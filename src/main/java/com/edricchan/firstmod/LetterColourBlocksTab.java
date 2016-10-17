package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModLetterColourBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LetterColourBlocksTab extends CreativeTabs {

	public LetterColourBlocksTab() {
		super("letterColourBlocksTab");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModLetterColourBlocks.BLOCK_LETTER_ORANGE);
	}
	

	
}

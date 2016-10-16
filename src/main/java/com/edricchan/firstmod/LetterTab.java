package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModLetters;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LetterTab extends CreativeTabs {

	public LetterTab() {
		super("letterTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModLetters.letter_a);
	}
	
}

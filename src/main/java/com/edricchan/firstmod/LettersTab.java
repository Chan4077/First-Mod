package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModLetters;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LettersTab extends CreativeTabs {

	public LettersTab() {
		super("lettersTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModLetters.letter_a;
	}
	
}

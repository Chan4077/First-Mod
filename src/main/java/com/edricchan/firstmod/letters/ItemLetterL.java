package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterL extends Item {

	public ItemLetterL() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_L.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_L.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}

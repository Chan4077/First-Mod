package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterB extends Item {

	public ItemLetterB() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_B.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_B.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}

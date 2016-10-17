package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterZ extends Item {

	public ItemLetterZ() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_Z.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_Z.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}

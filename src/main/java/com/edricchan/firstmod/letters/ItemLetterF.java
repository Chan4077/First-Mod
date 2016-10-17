package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterF extends Item {

	public ItemLetterF() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_F.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_F.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}

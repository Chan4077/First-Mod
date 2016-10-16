package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterG extends Item {

	public LetterG() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_G.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_G.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}

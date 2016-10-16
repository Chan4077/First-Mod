package com.edricchan.firstmod.foods;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.ItemFood;

public class FoodCracker extends ItemFood {

	public FoodCracker() {
		super(6, 1.0F, true);
		setUnlocalizedName(Reference.FirstFoods.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.FirstFoods.CRACKER.getRegistryName());
		setCreativeTab(FirstMod.FOOD_TAB);

	}

}

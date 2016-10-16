package com.edricchan.firstmod.foods;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.ItemFood;

public class FoodCheeseCookie extends ItemFood {

	public FoodCheeseCookie() {
		super(4, 1.0F, true);
		setUnlocalizedName(Reference.FirstFoods.CHEESE_AND_COOKIE.getUnlocalizedName());
		setRegistryName(Reference.FirstFoods.CHEESE_AND_COOKIE.getRegistryName());
		setCreativeTab(FirstMod.FOOD_TAB);
	}

}

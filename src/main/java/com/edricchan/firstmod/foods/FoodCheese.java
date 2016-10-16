package com.edricchan.firstmod.foods;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.ItemFood;

public class FoodCheese extends ItemFood {
	
	public FoodCheese() {
		super(2, 1.0F, true);
		setUnlocalizedName(Reference.FirstFoods.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.FirstFoods.CHEESE.getRegistryName());
		setCreativeTab(FirstMod.FOOD_TAB);
	}
}

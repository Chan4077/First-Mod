package com.edricchan.firstmod.handler;

import com.edricchan.firstmod.item.FoodCheese;
import com.edricchan.firstmod.item.FoodCheeseCookie;
import com.edricchan.firstmod.item.FoodCracker;
import com.edricchan.firstmod.item.ItemRuby;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	@GameRegistry.ObjectHolder("first:food_cheese")
	public static FoodCheese foodCheese;
	@GameRegistry.ObjectHolder("first:food_cheese_cookie")
	public static FoodCheeseCookie foodCheeseCookie;
	@GameRegistry.ObjectHolder("first:food_cracker")
	public static FoodCracker foodCracker;
	@GameRegistry.ObjectHolder("first:item_ruby")
	public static ItemRuby itemRuby;

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		foodCheese.initModel();
		foodCheeseCookie.initModel();
		foodCracker.initModel();
		itemRuby.initModel();
	}
}

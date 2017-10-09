package com.edricchan.firstmod.handlers;

import com.edricchan.firstmod.items.*;

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
	public static RubyItem itemRuby;
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		foodCheese.initModel();
		foodCheeseCookie.initModel();
		foodCracker.initModel();
		itemRuby.initModel();
	}
}

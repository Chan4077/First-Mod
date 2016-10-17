package com.edricchan.firstmod.init;

import com.edricchan.firstmod.foods.FoodCheese;
import com.edricchan.firstmod.foods.FoodCheeseCookie;
import com.edricchan.firstmod.foods.FoodCracker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModFoods {

	// Items
	public static Item CHEESE_AND_COOKIE;
	public static Item CHEESE;
	public static Item CRACKER;
	
	public static void init() {
		CHEESE_AND_COOKIE = new FoodCheeseCookie();
		CHEESE = new FoodCheese();
		CRACKER = new FoodCracker();
	}
	
	public static void register() {
		GameRegistry.register(CHEESE_AND_COOKIE);
		GameRegistry.register(CHEESE);
		GameRegistry.register(CRACKER);
	}
	
	public static void registerRenders() {
		registerRender(CHEESE_AND_COOKIE);
		registerRender(CHEESE);
		registerRender(CRACKER);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

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
	public static Item cheese_and_cookie;
	public static Item cheese;
	public static Item cracker;
	
	public static void init() {
		cheese_and_cookie = new FoodCheeseCookie();
		cheese = new FoodCheese();
		cracker = new FoodCracker();
	}
	
	public static void register() {
		GameRegistry.register(cheese_and_cookie);
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
	}
	
	public static void registerRenders() {
		registerRender(cheese_and_cookie);
		registerRender(cheese);
		registerRender(cracker);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

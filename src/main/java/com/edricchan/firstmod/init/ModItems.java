package com.edricchan.firstmod.init;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.items.ItemRuby;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	// Items
	public static Item ruby;
	
	public static void init() {
		ruby = new ItemRuby();
	}
	
	public static void register() {
		GameRegistry.register(ruby);
	}
	
	public static void registerRenders() {
		registerRender(ruby);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

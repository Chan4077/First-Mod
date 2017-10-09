//package com.edricchan.firstmod.handlers;
//
//import com.edricchan.firstmod.items.ItemModItem;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
//public class ItemHandler {
//	// Add items here
//	public static Item itemRuby;
//	// Food items
//	public static Item foodCheese;
//	public static Item foodCheeseCookie;
//	public static Item foodCracker;
//	// Letters
//	public static Item itemLetterA;
//	public static Item itemLetterB;
//	public static Item itemLetterC;
//	public static Item itemLetterD;
//	public static Item itemLetterE;
//	public static Item itemLetterF;
//	public static Item itemLetterG;
//	public static Item itemLetterH;
//	public static Item itemLetterI;
//	public static Item itemLetterJ;
//	public static Item itemLetterK;
//	public static Item itemLetterL;
//	public static Item itemLetterM;
//	public static Item itemLetterN;
//	public static Item itemLetterO;
//	public static Item itemLetterP;
//	public static Item itemLetterQ;
//	public static Item itemLetterR;
//	public static Item itemLetterS;
//	public static Item itemLetterT;
//	public static Item itemLetterU;
//	public static Item itemLetterV;
//	public static Item itemLetterW;
//	public static Item itemLetterX;
//	public static Item itemLetterY;
//	public static Item itemLetterZ;
//	// Initialize the item
//	public static void init() {
//		itemRuby = new ItemModItem("item_ruby", CreativeTabHandler.tabItems);
//		foodCheese = new ItemModItem("food_cheese", CreativeTabHandler.tabFoods);
//		foodCheeseCookie = new ItemModItem("food_cheese_cookie", CreativeTabHandler.tabFoods);
//		foodCracker = new ItemModItem("food_cracker", CreativeTabHandler.tabFoods);
//		// TODO: Add all letters
//		itemLetterA = new ItemModItem("item_letter_a", CreativeTabHandler.tabLetters);
//		itemLetterB = new ItemModItem("item_letter_b", CreativeTabHandler.tabLetters);
//		itemLetterC = new ItemModItem("item_letter_c", CreativeTabHandler.tabLetters);
//		itemLetterD = new ItemModItem("item_letter_d", CreativeTabHandler.tabLetters);
//		itemLetterE = new ItemModItem("item_letter_e", CreativeTabHandler.tabLetters);
//		itemLetterF = new ItemModItem("item_letter_f", CreativeTabHandler.tabLetters);
//		itemLetterG = new ItemModItem("item_letter_g", CreativeTabHandler.tabLetters);
//		itemLetterH = new ItemModItem("item_letter_h", CreativeTabHandler.tabLetters);
//		itemLetterI = new ItemModItem("item_letter_i", CreativeTabHandler.tabLetters);
//		itemLetterJ = new ItemModItem("item_letter_j", CreativeTabHandler.tabLetters);
//		itemLetterK = new ItemModItem("item_letter_k", CreativeTabHandler.tabLetters);
//		itemLetterL = new ItemModItem("item_letter_l", CreativeTabHandler.tabLetters);
//		itemLetterM = new ItemModItem("item_letter_m", CreativeTabHandler.tabLetters);
//		itemLetterN = new ItemModItem("item_letter_n", CreativeTabHandler.tabLetters);
//		itemLetterO = new ItemModItem("item_letter_o", CreativeTabHandler.tabLetters);
//		itemLetterP = new ItemModItem("item_letter_p", CreativeTabHandler.tabLetters);
//		itemLetterQ = new ItemModItem("item_letter_q", CreativeTabHandler.tabLetters);
//		itemLetterR = new ItemModItem("item_letter_r", CreativeTabHandler.tabLetters);
//		itemLetterS = new ItemModItem("item_letter_s", CreativeTabHandler.tabLetters);
//		itemLetterT = new ItemModItem("item_letter_t", CreativeTabHandler.tabLetters);
//		itemLetterU = new ItemModItem("item_letter_u", CreativeTabHandler.tabLetters);
//		itemLetterV = new ItemModItem("item_letter_v", CreativeTabHandler.tabLetters);
//		itemLetterW = new ItemModItem("item_letter_w", CreativeTabHandler.tabLetters);
//		itemLetterX = new ItemModItem("item_letter_x", CreativeTabHandler.tabLetters);
//		itemLetterY = new ItemModItem("item_letter_y", CreativeTabHandler.tabLetters);
//		itemLetterZ = new ItemModItem("item_letter_z", CreativeTabHandler.tabLetters);
//	}
//	// Register the item
//	public static void register() {
//		GameRegistry.register(itemRuby);
//		GameRegistry.register(foodCheese);
//		GameRegistry.register(foodCheeseCookie);
//		GameRegistry.register(foodCracker);
//		GameRegistry.register(itemLetterA);
//		GameRegistry.register(itemLetterB);
//		GameRegistry.register(itemLetterC);
//		GameRegistry.register(itemLetterD);
//		GameRegistry.register(itemLetterE);
//		GameRegistry.register(itemLetterF);
//		GameRegistry.register(itemLetterG);
//		GameRegistry.register(itemLetterH);
//		GameRegistry.register(itemLetterI);
//		GameRegistry.register(itemLetterJ);
//		GameRegistry.register(itemLetterK);
//		GameRegistry.register(itemLetterL);
//		GameRegistry.register(itemLetterM);
//		GameRegistry.register(itemLetterN);
//		GameRegistry.register(itemLetterO);
//		GameRegistry.register(itemLetterP);
//		GameRegistry.register(itemLetterQ);
//		GameRegistry.register(itemLetterR);
//		GameRegistry.register(itemLetterS);
//		GameRegistry.register(itemLetterT);
//		GameRegistry.register(itemLetterU);
//		GameRegistry.register(itemLetterV);
//		GameRegistry.register(itemLetterW);
//		GameRegistry.register(itemLetterX);
//		GameRegistry.register(itemLetterY);
//		GameRegistry.register(itemLetterZ);
//	}
//	// Register renders
//	public static void registerRenders() {
//		registerRender(itemRuby);
//		registerRender(foodCheese);
//		registerRender(foodCheeseCookie);
//		registerRender(foodCracker);
//		registerRender(itemLetterA);
//		registerRender(itemLetterB);
//		registerRender(itemLetterC);
//		registerRender(itemLetterD);
//		registerRender(itemLetterE);
//		registerRender(itemLetterF);
//		registerRender(itemLetterG);
//		registerRender(itemLetterH);
//		registerRender(itemLetterI);
//		registerRender(itemLetterJ);
//		registerRender(itemLetterK);
//		registerRender(itemLetterL);
//		registerRender(itemLetterM);
//		registerRender(itemLetterN);
//		registerRender(itemLetterO);
//		registerRender(itemLetterP);
//		registerRender(itemLetterQ);
//		registerRender(itemLetterR);
//		registerRender(itemLetterS);
//		registerRender(itemLetterT);
//		registerRender(itemLetterU);
//		registerRender(itemLetterV);
//		registerRender(itemLetterW);
//		registerRender(itemLetterX);
//		registerRender(itemLetterY);
//		registerRender(itemLetterZ);
//	}
//	public static void registerRender(Item item) {
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//	}
//}

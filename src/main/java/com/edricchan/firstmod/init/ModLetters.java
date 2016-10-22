package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letters.ItemLetterA;
import com.edricchan.firstmod.letters.ItemLetterB;
import com.edricchan.firstmod.letters.ItemLetterC;
import com.edricchan.firstmod.letters.ItemLetterD;
import com.edricchan.firstmod.letters.ItemLetterE;
import com.edricchan.firstmod.letters.ItemLetterF;
import com.edricchan.firstmod.letters.ItemLetterG;
import com.edricchan.firstmod.letters.ItemLetterH;
import com.edricchan.firstmod.letters.ItemLetterI;
import com.edricchan.firstmod.letters.ItemLetterJ;
import com.edricchan.firstmod.letters.ItemLetterK;
import com.edricchan.firstmod.letters.ItemLetterL;
import com.edricchan.firstmod.letters.ItemLetterM;
import com.edricchan.firstmod.letters.ItemLetterN;
import com.edricchan.firstmod.letters.ItemLetterO;
import com.edricchan.firstmod.letters.ItemLetterP;
import com.edricchan.firstmod.letters.ItemLetterQ;
import com.edricchan.firstmod.letters.ItemLetterR;
import com.edricchan.firstmod.letters.ItemLetterS;
import com.edricchan.firstmod.letters.ItemLetterT;
import com.edricchan.firstmod.letters.ItemLetterU;
import com.edricchan.firstmod.letters.ItemLetterV;
import com.edricchan.firstmod.letters.ItemLetterW;
import com.edricchan.firstmod.letters.ItemLetterX;
import com.edricchan.firstmod.letters.ItemLetterY;
import com.edricchan.firstmod.letters.ItemLetterZ;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetters {

	// Items
	public static Item ITEM_LETTER_A;
	public static Item ITEM_LETTER_B;
	public static Item ITEM_LETTER_C;
	public static Item ITEM_LETTER_D;
	public static Item ITEM_LETTER_E;
	public static Item ITEM_LETTER_F;
	public static Item ITEM_LETTER_G;
	public static Item ITEM_LETTER_H;
	public static Item ITEM_LETTER_I;
	public static Item ITEM_LETTER_J;
	public static Item ITEM_LETTER_K;
	public static Item ITEM_LETTER_L;
	public static Item ITEM_LETTER_M;
	public static Item ITEM_LETTER_N;
	public static Item ITEM_LETTER_O;
	public static Item ITEM_LETTER_P;
	public static Item ITEM_LETTER_Q;
	public static Item ITEM_LETTER_R;
	public static Item ITEM_LETTER_S;
	public static Item ITEM_LETTER_T;
	public static Item ITEM_LETTER_U;
	public static Item ITEM_LETTER_V;
	public static Item ITEM_LETTER_W;
	public static Item ITEM_LETTER_X;
	public static Item ITEM_LETTER_Y;
	public static Item ITEM_LETTER_Z;
	
	
	public static void init() {
		ITEM_LETTER_A = new ItemLetterA();
		ITEM_LETTER_B = new ItemLetterB();
		ITEM_LETTER_C = new ItemLetterC();
		ITEM_LETTER_D = new ItemLetterD();
		ITEM_LETTER_E = new ItemLetterE();
		ITEM_LETTER_F = new ItemLetterF();
		ITEM_LETTER_G = new ItemLetterG();
		ITEM_LETTER_H = new ItemLetterH();
		ITEM_LETTER_I = new ItemLetterI();
		ITEM_LETTER_J = new ItemLetterJ();
		ITEM_LETTER_K = new ItemLetterK();
		ITEM_LETTER_L = new ItemLetterL();
		ITEM_LETTER_M = new ItemLetterM();
		ITEM_LETTER_N = new ItemLetterN();
		ITEM_LETTER_O = new ItemLetterO();
		ITEM_LETTER_P = new ItemLetterP();
		ITEM_LETTER_Q = new ItemLetterQ();
		ITEM_LETTER_R = new ItemLetterR();
		ITEM_LETTER_S = new ItemLetterS();
		ITEM_LETTER_T = new ItemLetterT();
		ITEM_LETTER_U = new ItemLetterU();
		ITEM_LETTER_V = new ItemLetterV();
		ITEM_LETTER_W = new ItemLetterW();
		ITEM_LETTER_X = new ItemLetterX();
		ITEM_LETTER_Y = new ItemLetterY();
		ITEM_LETTER_Z = new ItemLetterZ();
	}
	
	public static void register() {
		GameRegistry.register(ITEM_LETTER_A);
		GameRegistry.register(ITEM_LETTER_B);
		GameRegistry.register(ITEM_LETTER_C);
		GameRegistry.register(ITEM_LETTER_D);
		GameRegistry.register(ITEM_LETTER_E);
		GameRegistry.register(ITEM_LETTER_F);
		GameRegistry.register(ITEM_LETTER_G);
		GameRegistry.register(ITEM_LETTER_H);
		GameRegistry.register(ITEM_LETTER_I);
		GameRegistry.register(ITEM_LETTER_J);
		GameRegistry.register(ITEM_LETTER_K);
		GameRegistry.register(ITEM_LETTER_L);
		GameRegistry.register(ITEM_LETTER_M);
		GameRegistry.register(ITEM_LETTER_N);
		GameRegistry.register(ITEM_LETTER_O);
		GameRegistry.register(ITEM_LETTER_P);
		GameRegistry.register(ITEM_LETTER_Q);
		GameRegistry.register(ITEM_LETTER_R);
		GameRegistry.register(ITEM_LETTER_S);
		GameRegistry.register(ITEM_LETTER_T);
		GameRegistry.register(ITEM_LETTER_U);
		GameRegistry.register(ITEM_LETTER_V);
		GameRegistry.register(ITEM_LETTER_W);
		GameRegistry.register(ITEM_LETTER_X);
		GameRegistry.register(ITEM_LETTER_Y);
		GameRegistry.register(ITEM_LETTER_Z);
	}
	public static void registerRenders() {
		registerRender(ITEM_LETTER_A);
		registerRender(ITEM_LETTER_B);
		registerRender(ITEM_LETTER_C);
		registerRender(ITEM_LETTER_D);
		registerRender(ITEM_LETTER_E);
		registerRender(ITEM_LETTER_F);
		registerRender(ITEM_LETTER_G);
		registerRender(ITEM_LETTER_H);
		registerRender(ITEM_LETTER_I);
		registerRender(ITEM_LETTER_J);
		registerRender(ITEM_LETTER_K);
		registerRender(ITEM_LETTER_L);
		registerRender(ITEM_LETTER_M);
		registerRender(ITEM_LETTER_N);
		registerRender(ITEM_LETTER_O);
		registerRender(ITEM_LETTER_P);
		registerRender(ITEM_LETTER_Q);
		registerRender(ITEM_LETTER_R);
		registerRender(ITEM_LETTER_S);
		registerRender(ITEM_LETTER_T);
		registerRender(ITEM_LETTER_U);
		registerRender(ITEM_LETTER_V);
		registerRender(ITEM_LETTER_W);
		registerRender(ITEM_LETTER_X);
		registerRender(ITEM_LETTER_Y);
		registerRender(ITEM_LETTER_Z);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

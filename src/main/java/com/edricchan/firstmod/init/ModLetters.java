package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letters.LetterA;
import com.edricchan.firstmod.letters.LetterB;
import com.edricchan.firstmod.letters.LetterC;
import com.edricchan.firstmod.letters.LetterD;
import com.edricchan.firstmod.letters.LetterE;
import com.edricchan.firstmod.letters.LetterF;
import com.edricchan.firstmod.letters.LetterG;
import com.edricchan.firstmod.letters.LetterH;
import com.edricchan.firstmod.letters.LetterI;
import com.edricchan.firstmod.letters.LetterJ;
import com.edricchan.firstmod.letters.LetterK;
import com.edricchan.firstmod.letters.LetterL;
import com.edricchan.firstmod.letters.LetterM;
import com.edricchan.firstmod.letters.LetterN;
import com.edricchan.firstmod.letters.LetterO;
import com.edricchan.firstmod.letters.LetterP;
import com.edricchan.firstmod.letters.LetterQ;
import com.edricchan.firstmod.letters.LetterR;
import com.edricchan.firstmod.letters.LetterS;
import com.edricchan.firstmod.letters.LetterT;
import com.edricchan.firstmod.letters.LetterU;
import com.edricchan.firstmod.letters.LetterV;
import com.edricchan.firstmod.letters.LetterW;
import com.edricchan.firstmod.letters.LetterX;
import com.edricchan.firstmod.letters.LetterY;
import com.edricchan.firstmod.letters.LetterZ;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetters {

	// Items
	public static Item letter_a;
	public static Item letter_b;
	public static Item letter_c;
	public static Item letter_d;
	public static Item letter_e;
	public static Item letter_f;
	public static Item letter_g;
	public static Item letter_h;
	public static Item letter_i;
	public static Item letter_j;
	public static Item letter_k;
	public static Item letter_l;
	public static Item letter_m;
	public static Item letter_n;
	public static Item letter_o;
	public static Item letter_p;
	public static Item letter_q;
	public static Item letter_r;
	public static Item letter_s;
	public static Item letter_t;
	public static Item letter_u;
	public static Item letter_v;
	public static Item letter_w;
	public static Item letter_x;
	public static Item letter_y;
	public static Item letter_z;
	
	public static void init() {
		letter_a = new LetterA();
		letter_b = new LetterB();
		letter_c = new LetterC();
		letter_d = new LetterD();
		letter_e = new LetterE();
		letter_f = new LetterF();
		letter_g = new LetterG();
		letter_h = new LetterH();
		letter_i = new LetterI();
		letter_j = new LetterJ();
		letter_k = new LetterK();
		letter_l = new LetterL();
		letter_m = new LetterM();
		letter_n = new LetterN();
		letter_o = new LetterO();
		letter_p = new LetterP();
		letter_q = new LetterQ();
		letter_r = new LetterR();
		letter_s = new LetterS();
		letter_t = new LetterT();
		letter_u = new LetterU();
		letter_v = new LetterV();
		letter_w = new LetterW();
		letter_x = new LetterX();
		letter_y = new LetterY();
		letter_z = new LetterZ();
	}
	
	public static void register() {
		GameRegistry.register(letter_a);
		GameRegistry.register(letter_b);
		GameRegistry.register(letter_c);
		GameRegistry.register(letter_d);
		GameRegistry.register(letter_e);
		GameRegistry.register(letter_f);
		GameRegistry.register(letter_g);
		GameRegistry.register(letter_h);
		GameRegistry.register(letter_i);
		GameRegistry.register(letter_j);
		GameRegistry.register(letter_k);
		GameRegistry.register(letter_l);
		GameRegistry.register(letter_m);
		GameRegistry.register(letter_n);
		GameRegistry.register(letter_o);
		GameRegistry.register(letter_p);
		GameRegistry.register(letter_q);
		GameRegistry.register(letter_r);
		GameRegistry.register(letter_s);
		GameRegistry.register(letter_t);
		GameRegistry.register(letter_u);
		GameRegistry.register(letter_v);
		GameRegistry.register(letter_w);
		GameRegistry.register(letter_x);
		GameRegistry.register(letter_y);
		GameRegistry.register(letter_z);
	}
	
	public static void registerRenders() {
		registerRender(letter_a);
		registerRender(letter_b);
		registerRender(letter_c);
		registerRender(letter_d);
		registerRender(letter_e);
		registerRender(letter_f);
		registerRender(letter_g);
		registerRender(letter_h);
		registerRender(letter_i);
		registerRender(letter_j);
		registerRender(letter_k);
		registerRender(letter_l);
		registerRender(letter_m);
		registerRender(letter_n);
		registerRender(letter_o);
		registerRender(letter_p);
		registerRender(letter_q);
		registerRender(letter_r);
		registerRender(letter_s);
		registerRender(letter_t);
		registerRender(letter_u);
		registerRender(letter_v);
		registerRender(letter_w);
		registerRender(letter_x);
		registerRender(letter_y);
		registerRender(letter_z);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

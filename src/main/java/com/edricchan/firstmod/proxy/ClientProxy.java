package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.init.ModBlocks;
import com.edricchan.firstmod.init.ModFoods;
import com.edricchan.firstmod.init.ModItems;
import com.edricchan.firstmod.init.ModLetters;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModLetters.registerRenders();
		ModFoods.registerRenders();
	}

}

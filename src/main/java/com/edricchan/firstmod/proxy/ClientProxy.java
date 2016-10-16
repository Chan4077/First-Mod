package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.init.ModBlocks;
import com.edricchan.firstmod.init.ModFoods;
import com.edricchan.firstmod.init.ModItems;
import com.edricchan.firstmod.init.ModLetterColourBlocks;
import com.edricchan.firstmod.init.ModLetters;
import com.edricchan.firstmod.init.ModLetterBlocks;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModLetterBlocks.registerRenders();
		ModFoods.registerRenders();
		ModLetterColourBlocks.registerRenders();
		ModLetters.registerRenders();
	}

}

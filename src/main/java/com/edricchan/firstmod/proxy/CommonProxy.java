package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.handlers.BlockHandler;
import com.edricchan.firstmod.handlers.CraftingHandler;
import com.edricchan.firstmod.handlers.ItemHandler;
import com.edricchan.firstmod.handlers.SmeltingHandler;

public class CommonProxy implements IProxy{
	
	public void init() {
	}

	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
		
		BlockHandler.init();
		BlockHandler.register();
	}

	public void postInit() {
		CraftingHandler.init();
		SmeltingHandler.init();
	};
}

package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.handlers.BlockHandler;
import com.edricchan.firstmod.handlers.ItemHandler;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
	}
}

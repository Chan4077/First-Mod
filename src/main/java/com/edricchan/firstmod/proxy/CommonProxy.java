package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.block.BlockLetterMaker;
import com.edricchan.firstmod.block.BlockSimple;
import com.edricchan.firstmod.handler.GuiHandler;
import com.edricchan.firstmod.handler.ModBlocks;
import com.edricchan.firstmod.item.FoodCheese;
import com.edricchan.firstmod.item.FoodCheeseCookie;
import com.edricchan.firstmod.item.FoodCracker;
import com.edricchan.firstmod.item.ItemRuby;
import com.edricchan.firstmod.network.PacketRequestUpdateLetterMaker;
import com.edricchan.firstmod.network.PacketUpdateLetterMaker;
import com.edricchan.firstmod.tileentity.TileEntityLetterMaker;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import static com.edricchan.firstmod.FirstMod.instance;
import static com.edricchan.firstmod.FirstMod.network;

@Mod.EventBusSubscriber
public class CommonProxy {
	/**
	 * The pre init hook
	 *
	 * @param e The pre initialization event
	 */
	public void preInit(FMLPreInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		network = NetworkRegistry.INSTANCE.newSimpleChannel("first");
		network.registerMessage(new PacketUpdateLetterMaker.Handler(), PacketUpdateLetterMaker.class, 0, Side.CLIENT);
		network.registerMessage(new PacketRequestUpdateLetterMaker.Handler(), PacketRequestUpdateLetterMaker.class, 1, Side.SERVER);
	}

	/**
	 * The init hook
	 *
	 * @param e The initialization event
	 */
	public void init(FMLInitializationEvent e) {
	}

	/**
	 * The post init hook
	 *
	 * @param e The post initialization event
	 */
	public void postInit(FMLPostInitializationEvent e) {
	}

	/**
	 * Registers all blocks from the mod
	 *
	 * @param event The registry event
	 */
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new BlockSimple());
		event.getRegistry().register(new BlockLetterMaker());
		GameRegistry.registerTileEntity(TileEntityLetterMaker.class, Reference.MOD_ID + "_letter_maker_block");
	}

	/**
	 * Registers all the mod item
	 *
	 * @param event The registry event
	 */
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(ModBlocks.blockSimple).setRegistryName(ModBlocks.blockSimple.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.blockLetterMaker).setRegistryName(ModBlocks.blockLetterMaker.getRegistryName()));
		event.getRegistry().register(new FoodCheese());
		event.getRegistry().register(new FoodCheeseCookie());
		event.getRegistry().register(new FoodCracker());
		event.getRegistry().register(new ItemRuby());
	}
}

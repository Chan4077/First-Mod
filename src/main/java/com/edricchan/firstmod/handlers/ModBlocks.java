package com.edricchan.firstmod.handlers;

import com.edricchan.firstmod.blocks.SimpleBlock;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
//	// Blocks
//	public static Block blockCheese;
//	public static ItemBlock ibBlockCheese;
//	public static Block blockChair;
//	public static ItemBlock ibBlockChair;
//	public static Block blockRuby;
//	public static ItemBlock ibBlockRuby;
//	// Letter blocks
//	public static Block blockLetterA;
//	public static ItemBlock ibBlockLetterA;
//	public static Block blockLetterB;
//	public static ItemBlock ibBlockLetterB;
//	public static Block blockLetterC;
//	public static ItemBlock ibBlockLetterC;
//	public static Block blockLetterD;
//	public static ItemBlock ibBlockLetterD;
//	public static Block blockLetterE;
//	public static ItemBlock ibBlockLetterE;
//	public static Block blockLetterF;
//	public static ItemBlock ibBlockLetterF;
//	public static Block blockLetterG;
//	public static ItemBlock ibBlockLetterG;
//	public static Block blockLetterH;
//	public static ItemBlock ibBlockLetterH;
//	public static Block blockLetterI;
//	public static ItemBlock ibBlockLetterI;
//	public static Block blockLetterJ;
//	public static ItemBlock ibBlockLetterJ;
//	public static Block blockLetterK;
//	public static ItemBlock ibBlockLetterK;
//	public static Block blockLetterL;
//	public static ItemBlock ibBlockLetterL;
//	public static Block blockLetterM;
//	public static ItemBlock ibBlockLetterM;
//	public static Block blockLetterN;
//	public static ItemBlock ibBlockLetterN;
//	public static Block blockLetterO;
//	public static ItemBlock ibBlockLetterO;
//	public static Block blockLetterP;
//	public static ItemBlock ibBlockLetterP;
//	public static Block blockLetterQ;
//	public static ItemBlock ibBlockLetterQ;
//	public static Block blockLetterR;
//	public static ItemBlock ibBlockLetterR;
//	public static Block blockLetterS;
//	public static ItemBlock ibBlockLetterS;
//	public static Block blockLetterT;
//	public static ItemBlock ibBlockLetterT;
//	public static Block blockLetterU;
//	public static ItemBlock ibBlockLetterU;
//	public static Block blockLetterV;
//	public static ItemBlock ibBlockLetterV;
//	public static Block blockLetterW;
//	public static ItemBlock ibBlockLetterW;
//	public static Block blockLetterX;
//	public static ItemBlock ibBlockLetterX;
//	public static Block blockLetterY;
//	public static ItemBlock ibBlockLetterY;
//	public static Block blockLetterZ;
//	public static ItemBlock ibBlockLetterZ;
//	// Letter colour blocks
//	public static Block blockLetterOrange;
//	public static ItemBlock ibBlockLetterOrange;
//	public static void init() {
//		blockCheese = new BlockModBlock(Material.CAKE, "block_cheese", CreativeTabHandler.tabBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockCheese = (ItemBlock) new ItemBlock(blockCheese);
//		blockChair = new BlockModBlock(Material.CLAY, "block_chair", CreativeTabHandler.tabBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockChair = (ItemBlock) new ItemBlock(blockChair);
//		blockRuby = new BlockModBlock(Material.ROCK, "block_ruby", CreativeTabHandler.tabBlocks, 1F, 15F, 3, "pickaxe");
//		ibBlockRuby = (ItemBlock) new ItemBlock(blockRuby);
//		// Letter blocks
//		blockLetterA = new BlockModBlock(Material.CLAY, "block_letter_a", CreativeTabHandler.tabLetterBlocks, 5F, 15f, 3, "pickaxe");
//		ibBlockLetterA = (ItemBlock) new ItemBlock(blockLetterA);
//		blockLetterB = new BlockModBlock(Material.CLAY, "block_letter_b", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterB = (ItemBlock) new ItemBlock(blockLetterB);
//		blockLetterC = new BlockModBlock(Material.CLAY, "block_letter_c", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterC = (ItemBlock) new ItemBlock(blockLetterC);
//		blockLetterD = new BlockModBlock(Material.CLAY, "block_letter_d", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterD = (ItemBlock) new ItemBlock(blockLetterD);
//		blockLetterE = new BlockModBlock(Material.CLAY, "block_letter_e", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterE = (ItemBlock) new ItemBlock(blockLetterE);
//		blockLetterF = new BlockModBlock(Material.CLAY, "block_letter_f", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterF = (ItemBlock) new ItemBlock(blockLetterF);
//		blockLetterG = new BlockModBlock(Material.CLAY, "block_letter_g", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterG = (ItemBlock) new ItemBlock(blockLetterG);
//		blockLetterH = new BlockModBlock(Material.CLAY, "block_letter_h", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterH = (ItemBlock) new ItemBlock(blockLetterH);
//		blockLetterI = new BlockModBlock(Material.CLAY, "block_letter_i", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterI = (ItemBlock) new ItemBlock(blockLetterI);
//		blockLetterJ = new BlockModBlock(Material.CLAY, "block_letter_j", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterJ = (ItemBlock) new ItemBlock(blockLetterJ);
//		blockLetterK = new BlockModBlock(Material.CLAY, "block_letter_k", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterK = (ItemBlock) new ItemBlock(blockLetterK);
//		blockLetterL = new BlockModBlock(Material.CLAY, "block_letter_l", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterL = (ItemBlock) new ItemBlock(blockLetterL);
//		blockLetterM = new BlockModBlock(Material.CLAY, "block_letter_m", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterM = (ItemBlock) new ItemBlock(blockLetterM);
//		blockLetterN = new BlockModBlock(Material.CLAY, "block_letter_n", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterN = (ItemBlock) new ItemBlock(blockLetterN);
//		blockLetterO = new BlockModBlock(Material.CLAY, "block_letter_o", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterO = (ItemBlock) new ItemBlock(blockLetterO);
//		blockLetterP = new BlockModBlock(Material.CLAY, "block_letter_p", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterP = (ItemBlock) new ItemBlock(blockLetterP);
//		blockLetterQ = new BlockModBlock(Material.CLAY, "block_letter_q", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterQ = (ItemBlock) new ItemBlock(blockLetterQ);
//		blockLetterR = new BlockModBlock(Material.CLAY, "block_letter_r", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterR = (ItemBlock) new ItemBlock(blockLetterR);
//		blockLetterS = new BlockModBlock(Material.CLAY, "block_letter_s", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterS = (ItemBlock) new ItemBlock(blockLetterS);
//		blockLetterT = new BlockModBlock(Material.CLAY, "block_letter_t", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterT = (ItemBlock) new ItemBlock(blockLetterT);
//		blockLetterU = new BlockModBlock(Material.CLAY, "block_letter_u", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterU = (ItemBlock) new ItemBlock(blockLetterU);
//		blockLetterV = new BlockModBlock(Material.CLAY, "block_letter_v", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterV = (ItemBlock) new ItemBlock(blockLetterV);
//		blockLetterW = new BlockModBlock(Material.CLAY, "block_letter_w", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterW = (ItemBlock) new ItemBlock(blockLetterW);
//		blockLetterX = new BlockModBlock(Material.CLAY, "block_letter_x", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterX = (ItemBlock) new ItemBlock(blockLetterX);
//		blockLetterY = new BlockModBlock(Material.CLAY, "block_letter_y", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterY = (ItemBlock) new ItemBlock(blockLetterY);
//		blockLetterZ = new BlockModBlock(Material.CLAY, "block_letter_z", CreativeTabHandler.tabLetterBlocks, 5F, 15F, 3, "pickaxe");
//		ibBlockLetterZ = (ItemBlock) new ItemBlock(blockLetterZ);
//		// Letter colour blocks
//		blockLetterOrange = new BlockModBlock(Material.WOOD, "block_letter_orange", CreativeTabHandler.tabLetterBlocks, 1F, 15F, 2, "pickaxe");
//		ibBlockLetterOrange = (ItemBlock) new ItemBlock(blockLetterOrange);
//	}
//
//	public static void register() {
//		
//		GameRegistry.register(blockCheese);
//		GameRegistry.register(ibBlockCheese, blockCheese.getRegistryName());
//		GameRegistry.register(blockChair);
//		GameRegistry.register(ibBlockChair, blockChair.getRegistryName());
//		// Letter blocks
//		GameRegistry.register(blockLetterA);
//		GameRegistry.register(ibBlockLetterA, blockLetterA.getRegistryName());
//		GameRegistry.register(blockLetterB);
//		GameRegistry.register(ibBlockLetterB, blockLetterB.getRegistryName());
//		GameRegistry.register(blockLetterC);
//		GameRegistry.register(ibBlockLetterC, blockLetterC.getRegistryName());
//		GameRegistry.register(blockLetterD);
//		GameRegistry.register(ibBlockLetterD, blockLetterD.getRegistryName());
//		GameRegistry.register(blockLetterE);
//		GameRegistry.register(ibBlockLetterE, blockLetterE.getRegistryName());
//		GameRegistry.register(blockLetterF);
//		GameRegistry.register(ibBlockLetterF, blockLetterF.getRegistryName());
//		GameRegistry.register(blockLetterG);
//		GameRegistry.register(ibBlockLetterG, blockLetterG.getRegistryName());
//		GameRegistry.register(blockLetterH);
//		GameRegistry.register(ibBlockLetterH, blockLetterH.getRegistryName());
//		GameRegistry.register(blockLetterI);
//		GameRegistry.register(ibBlockLetterI, blockLetterI.getRegistryName());
//		GameRegistry.register(blockLetterJ);
//		GameRegistry.register(ibBlockLetterJ, blockLetterJ.getRegistryName());
//		GameRegistry.register(blockLetterK);
//		GameRegistry.register(ibBlockLetterK, blockLetterK.getRegistryName());
//		GameRegistry.register(blockLetterL);
//		GameRegistry.register(ibBlockLetterL, blockLetterL.getRegistryName());
//		GameRegistry.register(blockLetterM);
//		GameRegistry.register(ibBlockLetterM, blockLetterM.getRegistryName());
//		GameRegistry.register(blockLetterN);
//		GameRegistry.register(ibBlockLetterN, blockLetterN.getRegistryName());
//		GameRegistry.register(blockLetterO);
//		GameRegistry.register(ibBlockLetterO, blockLetterO.getRegistryName());
//		GameRegistry.register(blockLetterP);
//		GameRegistry.register(ibBlockLetterP, blockLetterP.getRegistryName());
//		GameRegistry.register(blockLetterQ);
//		GameRegistry.register(ibBlockLetterQ, blockLetterQ.getRegistryName());
//		GameRegistry.register(blockLetterR);
//		GameRegistry.register(ibBlockLetterR, blockLetterR.getRegistryName());
//		GameRegistry.register(blockLetterS);
//		GameRegistry.register(ibBlockLetterS, blockLetterS.getRegistryName());
//		GameRegistry.register(blockLetterT);
//		GameRegistry.register(ibBlockLetterT, blockLetterT.getRegistryName());
//		GameRegistry.register(blockLetterU);
//		GameRegistry.register(ibBlockLetterU, blockLetterU.getRegistryName());
//		GameRegistry.register(blockLetterV);
//		GameRegistry.register(ibBlockLetterV, blockLetterV.getRegistryName());
//		GameRegistry.register(blockLetterW);
//		GameRegistry.register(ibBlockLetterW, blockLetterW.getRegistryName());
//		GameRegistry.register(blockLetterX);
//		GameRegistry.register(ibBlockLetterX, blockLetterX.getRegistryName());
//		GameRegistry.register(blockLetterY);
//		GameRegistry.register(ibBlockLetterY, blockLetterY.getRegistryName());
//		GameRegistry.register(blockLetterZ);
//		GameRegistry.register(ibBlockLetterZ, blockLetterZ.getRegistryName());
//		// Letter colour blocks
//		GameRegistry.register(blockLetterOrange);
//		GameRegistry.register(ibBlockLetterOrange, blockLetterOrange.getRegistryName());
//	}
//
//	public static void registerRenders() {
//		registerRender(blockCheese);
//		registerRender(blockChair);
//		registerRender(blockRuby);
//		// Letter blocks
//		registerRender(blockLetterA);
//		registerRender(blockLetterB);
//		registerRender(blockLetterC);
//		registerRender(blockLetterD);
//		registerRender(blockLetterE);
//		registerRender(blockLetterF);
//		registerRender(blockLetterG);
//		registerRender(blockLetterH);
//		registerRender(blockLetterI);
//		registerRender(blockLetterJ);
//		registerRender(blockLetterK);
//		registerRender(blockLetterL);
//		registerRender(blockLetterM);
//		registerRender(blockLetterN);
//		registerRender(blockLetterO);
//		registerRender(blockLetterP);
//		registerRender(blockLetterQ);
//		registerRender(blockLetterR);
//		registerRender(blockLetterS);
//		registerRender(blockLetterT);
//		registerRender(blockLetterU);
//		registerRender(blockLetterV);
//		registerRender(blockLetterW);
//		registerRender(blockLetterX);
//		registerRender(blockLetterY);
//		registerRender(blockLetterZ);
//		// Letter colour blocks
//		registerRender(blockLetterOrange);
//	}
//
//	public static void registerRender(Block block) {
//		Item item = Item.getItemFromBlock(block);
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//	}
	@GameRegistry.ObjectHolder("first:simpleblock")
	public static SimpleBlock simpleBlock;
	
	/**
	 * Initializes all item models
	 */
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		simpleBlock.initModel();
	}
}

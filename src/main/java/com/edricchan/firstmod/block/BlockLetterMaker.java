package com.edricchan.firstmod.block;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handler.CreativeTabHandler;
import com.edricchan.firstmod.handler.GuiHandler;
import com.edricchan.firstmod.tileentity.TileEntityLetterMaker;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class BlockLetterMaker extends Block implements ITileEntityProvider {

	public BlockLetterMaker() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MOD_ID + ".letter_maker_block");
		setRegistryName("letter_maker_block");
		setCreativeTab(CreativeTabHandler.tabBlocks);
		setHardness(1.0F);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("This block is used for making letters!");
		if (GuiScreen.isAltKeyDown()) {
			tooltip.add("§cBut seriously, you should probably just use some other letter mod!§r");
		} else {
			tooltip.add("§cPress [ALT] for more info§r");
		}
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			player.openGui(FirstMod.instance, GuiHandler.LETTER_MAKER, world, pos.getX(), pos.getY(), pos.getZ());
			return true;
		}
		return true;
	}

	@Nullable
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityLetterMaker();
	}
}

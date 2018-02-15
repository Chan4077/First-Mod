package com.edricchan.firstmod.network;

import com.edricchan.firstmod.tileentity.TileEntityLetterMaker;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * @author shadowfacts
 */
public class PacketRequestUpdateLetterMaker implements IMessage {

	private BlockPos pos;
	private int dimension;

	public PacketRequestUpdateLetterMaker(BlockPos pos, int dimension) {
		this.pos = pos;
		this.dimension = dimension;
	}

	public PacketRequestUpdateLetterMaker(TileEntityLetterMaker te) {
		this(te.getPos(), te.getWorld().provider.getDimension());
	}

	public PacketRequestUpdateLetterMaker() {
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(pos.toLong());
		buf.writeInt(dimension);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		pos = BlockPos.fromLong(buf.readLong());
		dimension = buf.readInt();
	}

	public static class Handler implements IMessageHandler<PacketRequestUpdateLetterMaker, PacketUpdateLetterMaker> {

		@Override
		public PacketUpdateLetterMaker onMessage(PacketRequestUpdateLetterMaker message, MessageContext ctx) {
			World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(message.dimension);
			TileEntityLetterMaker te = (TileEntityLetterMaker) world.getTileEntity(message.pos);
			if (te != null) {
				return new PacketUpdateLetterMaker(te);
			} else {
				return null;
			}
		}

	}

}

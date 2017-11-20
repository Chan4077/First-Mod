package com.edricchan.firstmod.gui;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.container.LetterMakerContainer;
import com.edricchan.firstmod.tileentity.LetterMakerContainerTileEntity;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class LetterMakerContainerGui extends GuiContainer {
	public static final int WIDTH = 180;
	public static final int HEIGHT = 152;

	private static final ResourceLocation background = new ResourceLocation(Reference.MODID, "textures/gui/lettermakercontainer.png");

	public LetterMakerContainerGui(LetterMakerContainerTileEntity tileEntity, LetterMakerContainer container) {
		super(container);

		xSize = WIDTH;
		ySize = HEIGHT;
	}
	@Override
	public void initGui() {
		super.initGui();

		this.buttonList.add(new GuiButton( 1, 75, 150, 50, 20, "Hello"));
	}
	@Override
	protected void actionPerformed(GuiButton guiButton) {
		if (guiButton.id == 1) {
			System.out.println("Hello world!");
		}
	}
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		mc.getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		super.renderHoveredToolTip(mouseX, mouseY);
	}
}
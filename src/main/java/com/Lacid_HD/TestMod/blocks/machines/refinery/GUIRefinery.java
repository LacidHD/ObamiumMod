/*package com.Lacid_HD.TestMod.blocks.machines.refinery;

import com.Lacid_HD.TestMod.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;



public class GUIRefinery extends GuiContainer 
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID +  ":textures/gui/refinery.png");
	private final InventoryPlayer player;
	private final TileEntityRefinery tileentity;
	
	public GUIRefinery(InventoryPlayer player, TileEntityRefinery tileentity)
	{
		super(new ContainerRefinery(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2 + 3), 8, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		
	}


}
*/
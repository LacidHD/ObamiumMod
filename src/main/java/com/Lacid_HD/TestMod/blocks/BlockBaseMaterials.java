package com.Lacid_HD.TestMod.blocks;

import com.Lacid_HD.TestMod.Main;
import com.Lacid_HD.TestMod.init.ModBlocks;
import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBaseMaterials extends Block implements IHasModel
{
	public BlockBaseMaterials(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabObamiumMaterials);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	
	}

	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");	
		
	

}
}
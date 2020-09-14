package com.Lacid_HD.TestMod.items.tools;

import com.Lacid_HD.TestMod.Main;
import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolBlobPickaxe extends ItemPickaxe implements IHasModel
{

	public ToolBlobPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabObamiumTA);
		
		ModItems.ITEMS.add(this);
	}
	
	
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	
}

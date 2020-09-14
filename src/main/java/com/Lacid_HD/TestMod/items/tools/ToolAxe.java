package com.Lacid_HD.TestMod.items.tools;

import com.Lacid_HD.TestMod.Main;
import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.util.interfaces.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 400.0F, -2.2F);
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

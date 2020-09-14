package com.Lacid_HD.TestMod.items;

import com.Lacid_HD.TestMod.Main;
import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBaseElectricStuff extends Item implements IHasModel{

	public ItemBaseElectricStuff(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabObamiumElectricStuff);
		
		ModItems.ITEMS.add(this);
	}
	
	
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}

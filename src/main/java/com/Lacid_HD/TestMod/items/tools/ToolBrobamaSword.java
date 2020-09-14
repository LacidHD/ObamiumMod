package com.Lacid_HD.TestMod.items.tools;



import java.util.List;

import com.Lacid_HD.TestMod.Main;
import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ToolBrobamaSword extends ItemSword implements IHasModel
{


	public ToolBrobamaSword(String name, ToolMaterial material) 
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
	
	public void addInformation(ItemStack stack, EntityPlayer player, List itemInformation, boolean par4)
	{
	itemInformation.add("F for fried PC");
	}
	
	
}

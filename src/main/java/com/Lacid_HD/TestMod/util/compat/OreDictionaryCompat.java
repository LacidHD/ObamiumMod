package com.Lacid_HD.TestMod.util.compat;

import com.Lacid_HD.TestMod.init.ModBlocks;
import com.Lacid_HD.TestMod.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("oreObamium", ModBlocks.OBAMIUM_ORE);
		OreDictionary.registerOre("ingotObamium", ModItems.OBAMIUM);
		
		OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
		OreDictionary.registerOre("oreCopper", ModBlocks.COPPER_ORE);
		//OreDictionary.registerOre("copper_block", ModBlocks.COPPER_BLOCK);
		
		OreDictionary.registerOre("ingotMeme", ModItems.MEME_ESSENCE);
		OreDictionary.registerOre("oreMeme", ModBlocks.MEME_ORE);
		
		
	}
}

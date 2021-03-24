
package com.Lacid_HD.TestMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.OBAMIUM_ORE, new ItemStack(ModItems.OBAMIUM_NUGGET, 1), 5f);
		GameRegistry.addSmelting(ModBlocks.MEME_ORE, new ItemStack(ModItems.MEME_ESSENCE, 1), 3f);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 1f);
		
		
	}
}

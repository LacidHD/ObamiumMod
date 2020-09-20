/*
package com.Lacid_HD.TestMod.blocks.machines.refinery;

import java.util.Map;


import com.Lacid_HD.TestMod.init.ModBlocks;
import com.Lacid_HD.TestMod.init.ModItems;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset.Entry;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;


public class RefineryRecipes
{
	private static final RefineryRecipes INSTANCE = new RefineryRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static RefineryRecipes getInstance()
	{
		return INSTANCE;
	}

	private RefineryRecipes()
	{
		addRefineryRecipe(new ItemStack(ModItems.OBAMIUM), new ItemStack(ModItems.PURE_ESSENCE), new ItemStack(ModItems.OBAMASPHERE), 0F);
	}

	public void addRefineryRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
	{
		if(getRefineryResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}

	public ItemStack getRefineryResult(ItemStack input1, ItemStack input2)
		{
			for(java.util.Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
			{
				if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
				{
					for(java.util.Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
					{
						if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
						{
							return (ItemStack)ent.getValue();
						}
					}
				}
			}
			return ItemStack.EMPTY;
		}


		private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
		{
			return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
		}

		private Table<ItemStack, ItemStack, ItemStack> getDualStringList()
		{
			return this.smeltingList;
		}

		public float getRefineryExperience(ItemStack stack)
		{
			for (java.util.Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			{
				if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
				{
					return ((Float)entry.getValue()).floatValue();
				}
			}
			return 0.0F;
		}




}		
*/
		
		
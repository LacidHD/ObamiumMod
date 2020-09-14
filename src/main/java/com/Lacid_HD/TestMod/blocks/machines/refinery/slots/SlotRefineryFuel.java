package com.Lacid_HD.TestMod.blocks.machines.refinery.slots;


import com.Lacid_HD.TestMod.blocks.machines.refinery.TileEntityRefinery;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotRefineryFuel extends Slot
{
	public SlotRefineryFuel(IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
	}
	


	/*@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityRefinery.isItemFuel(stack);
	}*/
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
	
}

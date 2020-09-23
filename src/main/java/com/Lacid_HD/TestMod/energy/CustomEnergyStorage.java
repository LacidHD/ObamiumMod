/*
package com.Lacid_HD.TestMod.energy;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.energy.EnergyStorage;

public class CustomEnergyStorage extends EnergyStorage
{
    public CustomEnergyStorage(int capacity)
    {
        super(capacity, capacity, capacity, 0);
    }

    public CustomEnergyStorage(int capacity, int maxTransfer)
    {
        super(capacity, maxTransfer, maxTransfer, 0);
    }

    public CustomEnergyStorage(int capacity, int maxReceive, int maxExtract)
    {
        super(capacity, maxReceive, maxExtract, 0);
    }

    public CustomEnergyStorage(int capacity, int maxReceive, int maxExtract, int energy)
    {
    	 super(capacity, maxReceive, maxExtract, energy);
    }
    
    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
    	return super.receiveEnergy(maxReceive, simulate);
    }
    
    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
    	return super.extractEnergy(maxExtract, simulate);
    }
    
    @Override
    public int getEnergyStored() {
    	return super.getEnergyStored();
    }
    
    @Override
    public int getMaxEnergyStored() {
    	// TODO Auto-generated method stub
    	return super.getMaxEnergyStored();
    }
    
    @Override
    public boolean canExtract() {
    	// TODO Auto-generated method stub
    	return super.canExtract();
    }
   
    @Override
    public boolean canReceive() {
    	// TODO Auto-generated method stub
    	return super.canReceive();
    }

    public void readFromNBT(NBTTagCompound compund)
    {
    	this.energy = compund.getInteger("Energy");
    	this.capacity = compund.getInteger("Capacity");
    	this.maxReceive = compund.getInteger("MaxReceive");
    	this.maxExtract = compund.getInteger("MaxExtract");
    }

    public void writeToNBT(NBTTagCompound compound) 
    {
    	compound.setInteger("Energy", this.energy);
    	compound.setInteger("Capacity", this.capacity);
    	compound.setInteger("MaxReceive", this.maxReceive);
    	compound.setInteger("MaxExtract", this.maxExtract);
    	
    }
    
}
*/

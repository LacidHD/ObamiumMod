package com.Lacid_HD.TestMod.blocks;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

public class MemeOre extends BlockBase{

	public MemeOre(String name, Material material)
	{
		super(name, material);
	
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(50.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(5.0F);
		
	}


}

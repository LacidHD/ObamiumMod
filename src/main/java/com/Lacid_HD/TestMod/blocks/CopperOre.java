package com.Lacid_HD.TestMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase{

	public CopperOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(20.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(5.0F);
		
	}
}

	
		


package com.Lacid_HD.TestMod.blocks;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

public class ObamiumBlock extends BlockBaseMaterials 
{

	public ObamiumBlock(String name, Material material)
	{
		super(name, material);
	
		setSoundType(SoundType.METAL);
		setHardness(100.0F);
		setResistance(400000000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(100.0F);
		
	}

}

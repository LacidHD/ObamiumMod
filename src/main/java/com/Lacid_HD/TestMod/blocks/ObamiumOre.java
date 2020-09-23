package com.Lacid_HD.TestMod.blocks;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

public class ObamiumOre extends BlockBaseMaterials{

	public ObamiumOre(String name, Material material)
	{
		super(name, material);
	
		setSoundType(SoundType.STONE);
		setHardness(15.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(5.0F);
		
	}


}

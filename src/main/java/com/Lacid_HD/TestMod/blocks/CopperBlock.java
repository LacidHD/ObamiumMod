package com.Lacid_HD.TestMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends BlockBaseMaterials{

	public CopperBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(25.0F);
		setResistance(6.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0F);
		
	}
}

	
		


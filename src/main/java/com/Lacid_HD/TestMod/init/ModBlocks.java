package com.Lacid_HD.TestMod.init;

import java.util.ArrayList;



import com.Lacid_HD.TestMod.blocks.BlockBase;
import com.Lacid_HD.TestMod.blocks.ObamiumBlock;
import com.Lacid_HD.TestMod.blocks.ObamiumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.List;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OBAMIUM_BLOCK = new ObamiumBlock("obamium_block", Material.IRON);
	public static final Block OBAMIUM_ORE = new ObamiumOre("obamium_ore", Material.GROUND);
}
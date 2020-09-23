package com.Lacid_HD.TestMod.init;

import java.util.ArrayList;
import com.Lacid_HD.TestMod.blocks.BlockBaseMaterials;
import com.Lacid_HD.TestMod.blocks.CopperBlock;
import com.Lacid_HD.TestMod.blocks.CopperOre;
import com.Lacid_HD.TestMod.blocks.MemeBlock;
import com.Lacid_HD.TestMod.blocks.MemeOre;
import com.Lacid_HD.TestMod.blocks.ObamiumBlock;
import com.Lacid_HD.TestMod.blocks.ObamiumOre;
//import com.Lacid_HD.TestMod.blocks.machines.refinery.BlockRefinery;
//import com.Lacid_HD.TestMod.blocks.Energy.storage.BlockENS;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.List;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	//blocks
	public static final Block OBAMIUM_BLOCK = new ObamiumBlock("obamium_block", Material.IRON);
	public static final Block OBAMIUM_ORE = new ObamiumOre("obamium_ore", Material.GROUND);
	public static final Block MEME_ORE = new MemeOre("meme_ore", Material.GROUND);
	public static final Block MEME_BLOCK = new MemeBlock("meme_block", Material.GROUND);
	public static final Block PURE_MEME_BLOCK = new MemeBlock("pure_meme_block", Material.GROUND);
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.GROUND);
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.GROUND);
	
	
	//machines
	//public static final Block REFINERY = new BlockRefinery("refinery");
	
	
	
	//energy
	//public static final Block ENS_1 = new BlockENS("ens_1");
	
}	
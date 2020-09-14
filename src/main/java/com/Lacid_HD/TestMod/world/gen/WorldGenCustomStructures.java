/*
package com.Lacid_HD.TestMod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.Lacid_HD.TestMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomStructures implements IWorldGenerator
{
	public static final WorldGenStructure SMALL_HOUSE = new WorldGenStructure("small_house");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension()) 
		{
		
		
		case 1:
			break;
			
			
		case 0:
			
			generateStructure(SMALL_HOUSE, world, random, chunkX, chunkZ, 1, Blocks.SAND, BiomeDesert.class);
			
			break;
			
		case -1:
		}
	}


	private void generateStructure(WorldGenStructure generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<BiomeDesert> class1)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(class1));
		
		int x = (chunkX * 16) + random.nextInt(15);
		int z = (chunkZ * 16) + random.nextInt(15);
		int y = calculateGenerationHight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		
		
			if(classesList.contains(biome)) 
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	
	
	private static int calculateGenerationHight(World world, int x, int z, Block topBlock) 
	{
		int y = world.getHeight();
		boolean foundGround = false;
				
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x, y, z)).getBlock();
			foundGround = block == topBlock;
		}
		return y;
	}
}


*/














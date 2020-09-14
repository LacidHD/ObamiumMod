/*package com.Lacid_HD.TestMod.init;

import com.Lacid_HD.TestMod.world.biome.BiomeObamaome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
	public static final Biome OBAMAOME = new BiomeObamaome();
			
	public static void registerBiomes() 
	{
		initBiome(OBAMAOME, "obamaome", BiomeType.WARM, Type.PLAINS, Type.MOUNTAIN, Type.HILLS);
	}
	
	private static Biome initBiome(Biome biome,String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		return biome;
		
	}
}
*/
package com.Lacid_HD.TestMod;

import com.Lacid_HD.TestMod.init.ModItems;
import com.Lacid_HD.TestMod.init.ModRecipes;
import com.Lacid_HD.TestMod.proxy.CommonProxy;
import com.Lacid_HD.TestMod.util.Reference;
import com.Lacid_HD.TestMod.world.gen.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;



@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
	}

	public static CreativeTabs tabObamiumMaterials = new CreativeTabs("tabobamiummaterials") {
		
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.OBAMIUM);
		}
	};
	
		public static CreativeTabs tabObamiumTA = new CreativeTabs("tabobamiumta") {
		
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.OBAMIUM_SWORD);
			}
		};
		
		public static CreativeTabs tabObamiumElectricStuff = new CreativeTabs("tabobamiumelectricstuff") {
			
			public ItemStack getTabIconItem() {
				return new ItemStack(ModItems.COPPER_COIL);
			}
		};
	}

		
	

	
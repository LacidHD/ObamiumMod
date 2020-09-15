package com.Lacid_HD.TestMod.init;

import java.util.ArrayList;

import java.util.List;

import com.Lacid_HD.TestMod.items.ItemBase;
import com.Lacid_HD.TestMod.items.ItemBaseElectricStuff;
import com.Lacid_HD.TestMod.items.ItemBaseStuff;
import com.Lacid_HD.TestMod.items.armor.ArmorBase;
import com.Lacid_HD.TestMod.items.tools.ToolAxe;
import com.Lacid_HD.TestMod.items.tools.ToolBlobPickaxe;
import com.Lacid_HD.TestMod.items.tools.ToolBrobamaSword;
import com.Lacid_HD.TestMod.items.tools.ToolHoe;
import com.Lacid_HD.TestMod.items.tools.ToolPickaxe;
import com.Lacid_HD.TestMod.items.tools.ToolSpade;
import com.Lacid_HD.TestMod.items.tools.ToolSword;
import com.Lacid_HD.TestMod.items.tools.ToolWalter;
import com.Lacid_HD.TestMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
  public static final List<Item> ITEMS = new ArrayList<Item>();
  
  //materials
  public static final ToolMaterial MATERIAL_OBAMIUM = EnumHelper.addToolMaterial("material_obamium", 3, 911, 20, 50, 10);
  public static final ToolMaterial MATERIAL_MEMES = EnumHelper.addToolMaterial("material_memes", 3, 690, 10, 20, 10);
  public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 191, 5.0F, 2.0F, 3);
  public static final ArmorMaterial ARMOR_MATERIAL_OBAMIUM = EnumHelper.addArmorMaterial("armor_material_obamium", Reference.MOD_ID + ":obamium", 25, new int[ ] {100, 150, 200, 100} , 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
  public static final ArmorMaterial ARMOR_MATERIAL_MEMES = EnumHelper.addArmorMaterial("armor_material_memes", Reference.MOD_ID + ":memes", 25, new int[ ] {20, 150, 200, 100} , 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
   
  //Basic items
  public static final Item OBAMIUM = new ItemBaseStuff("obamium"); 
  public static final Item OBAMASPHERE = new ItemBaseStuff("obamasphere");
  public static final Item OBAMAFUEL = new ItemBaseStuff("obamafuel");
  public static final Item OBAMIUM_NUGGET = new ItemBaseStuff("obamium_nugget");
  public static final Item MEME_ESSENCE = new ItemBaseStuff("meme_essence");
  public static final Item PURE_ESSENCE = new ItemBaseStuff("pure_essence");
  public static final Item COPPER_INGOT = new ItemBaseStuff("copper_ingot");
  
  
  
  //electric stuff / machines
 public static final Item ELECTRIC_UNIT = new ItemBaseElectricStuff("electric_unit"); 
 public static final Item MAGNET = new ItemBaseElectricStuff("magnet");
 public static final Item COPPER_COIL = new ItemBaseElectricStuff("copper_coil");
 public static final Item ELECTRIC_MOTOR = new ItemBaseElectricStuff("electric_motor");
 public static final Item GENERATOR_UNIT = new ItemBaseElectricStuff("generator_unit");
 public static final Item ROTOR = new ItemBaseElectricStuff("rotor");
 public static final Item STATOR = new ItemBaseElectricStuff("stator");
 public static final Item MACHINE_CASING = new ItemBaseElectricStuff("machine_casing");
 
  

  
  
  //tools
  public static final ItemSword OBAMIUM_SWORD = new ToolSword("obamium_sword", MATERIAL_OBAMIUM);
  public static final ItemSpade OBAMIUM_SHOVEL = new ToolSpade("obamium_shovel", MATERIAL_OBAMIUM);
  public static final ItemPickaxe OBAMIUM_PICKAXE = new ToolPickaxe("obamium_pickaxe", MATERIAL_OBAMIUM);
  public static final ItemAxe OBAMIUM_AXE = new ToolAxe("obamium_axe", MATERIAL_OBAMIUM);
  public static final ItemHoe OBAMIUM_HOE = new ToolHoe("obamium_hoe", MATERIAL_OBAMIUM);
  
  public static final ItemSword BROBAMA_SWORD = new ToolBrobamaSword("brobama_sword", MATERIAL_MEMES);
  public static final ItemSpade WALTER = new ToolWalter("walter", MATERIAL_MEMES);
  public static final ItemPickaxe BLOB_PICKAXE = new ToolBlobPickaxe("blob_pickaxe", MATERIAL_MEMES);
  public static final ItemAxe MEME_AXE = new ToolAxe("meme_axe", MATERIAL_MEMES);
  public static final ItemHoe MEME_HOE = new ToolHoe("meme_hoe", MATERIAL_MEMES);
  
  public static final ItemSword COPPER_SWORD = new ToolBrobamaSword("brobama_sword", MATERIAL_MEMES);
  public static final ItemSpade COPPER_SHOVEL = new ToolWalter("copper_shovel", MATERIAL_MEMES);
  public static final ItemPickaxe COPPER_PICKAXE = new ToolBlobPickaxe("copper_pickaxe", MATERIAL_MEMES);
  public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_MEMES);
  public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_MEMES);
  
  
  //armor
  public static final Item OBAMIUM_HELMET = new ArmorBase("obamium_helmet", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.HEAD);
  public static final Item OBAMIUM_CHESTPLATE = new ArmorBase("obamium_chestplate", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.CHEST);
  public static final Item OBAMIUM_LEGGINGSS = new ArmorBase("obamium_leggings", ARMOR_MATERIAL_OBAMIUM, 2, EntityEquipmentSlot.LEGS);
  public static final Item OBAMIUM_BOOTS = new ArmorBase("obamium_boots", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.FEET);
  
  public static final Item MEMERS_HELMET = new ArmorBase("memers_helmet", ARMOR_MATERIAL_MEMES, 1, EntityEquipmentSlot.HEAD);
  public static final Item MEMERS_CHESTPLATE = new ArmorBase("memers_chestplate", ARMOR_MATERIAL_MEMES, 1, EntityEquipmentSlot.CHEST);
  public static final Item MEMERS_LEGGINGSS = new ArmorBase("memers_leggings", ARMOR_MATERIAL_MEMES, 2, EntityEquipmentSlot.LEGS);
  public static final Item MEMERS_BOOTS = new ArmorBase("memers_boots", ARMOR_MATERIAL_MEMES, 1, EntityEquipmentSlot.FEET);
  
  

}

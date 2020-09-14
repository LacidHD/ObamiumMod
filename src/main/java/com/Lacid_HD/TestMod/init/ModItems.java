package com.Lacid_HD.TestMod.init;

import java.util.ArrayList;

import java.util.List;

import com.Lacid_HD.TestMod.items.ItemBase;
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
  public static final ToolMaterial MATERIAL_OBAMIUM = EnumHelper.addToolMaterial("material_obamium", 3, 6900, 20, 400, 10);
  public static final ToolMaterial MATERIAL_BROBAMA = EnumHelper.addToolMaterial("material_brobama", 3, 1109, 10, 100, 10);
  public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 250, 3, 7, 5);
  public static final ArmorMaterial ARMOR_MATERIAL_OBAMIUM = EnumHelper.addArmorMaterial("armor_material_obamium", Reference.MOD_ID + ":obamium", 25, new int[ ] {100, 150, 200, 100} , 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
  
  //Basic items
  public static final Item OBAMIUM = new ItemBase("obamium"); 
  public static final Item OBAMASPHERE = new ItemBase("obamasphere");
  public static final Item OBAMAFUEL = new ItemBase("obamafuel");
  public static final Item OBAMIUM_NUGGET = new ItemBase("obamium_nugget");
  public static final Item MEME_ESSENCE = new ItemBase("meme_essence");
  public static final Item PURE_ESSENCE = new ItemBase("pure_essence");
  public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
  
  
  //electric stuff
 public static final Item ELECTRIC_UNIT = new ItemBase("electric_unit");
 public static final Item MAGNET = new ItemBase("magnet");
 public static final Item COPPER_COIL = new ItemBase("copper_coil");
  
  
  //tools
  public static final ItemSword OBAMIUM_SWORD = new ToolSword("obamium_sword", MATERIAL_OBAMIUM);
  public static final ItemSpade OBAMIUM_SHOVEL = new ToolSpade("obamium_shovel", MATERIAL_OBAMIUM);
  public static final ItemPickaxe OBAMIUM_PICKAXE = new ToolPickaxe("obamium_pickaxe", MATERIAL_OBAMIUM);
  public static final ItemAxe OBAMIUM_AXE = new ToolAxe("obamium_axe", MATERIAL_OBAMIUM);
  public static final ItemHoe OBAMIUM_HOE = new ToolHoe("obamium_hoe", MATERIAL_OBAMIUM);
  public static final ItemSword BROBAMA_SWORD = new ToolBrobamaSword("brobama_sword", MATERIAL_BROBAMA);
  public static final ItemSpade WALTER = new ToolWalter("walter", MATERIAL_BROBAMA);
  public static final ItemPickaxe BLOB_PICKAXE = new ToolBlobPickaxe("blob_pickaxe", MATERIAL_BROBAMA);
  
  
  //armor
  public static final Item OBAMIUM_HELMET = new ArmorBase("obamium_helmet", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.HEAD);
  public static final Item OBAMIUM_CHESTPLATE = new ArmorBase("obamium_chestplate", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.CHEST);
  public static final Item OBAMIUM_LEGGINGSS = new ArmorBase("obamium_leggings", ARMOR_MATERIAL_OBAMIUM, 2, EntityEquipmentSlot.LEGS);
  public static final Item OBAMIUM_BOOTS = new ArmorBase("obamium_boots", ARMOR_MATERIAL_OBAMIUM, 1, EntityEquipmentSlot.FEET);

}

/*
package com.Lacid_HD.TestMod.util.compat.jei;

import java.util.IllegalFormatException;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.util.text.translation.I18n;

public class JEICompat implements IModPlugin
{
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		
		
	}
	
	@Override
	public void register(IModRegistry registry) {
		
		
	}

	public static String translateToLocal(String key)
	{
		if(I18n.canTranslate(key)) return I18n.translateToLocal(key);
		else return I18n.translateToFallback(key);
	}

	public static String translateToLocalFormatted(String key, Object... format) 
	{
		String s = translateToLocal(key);
		try
		{
				return String.format(s, format);
		}catch(IllegalFormatException e)
		{
			return "Format error: " + s;
		}
	}


}
*/
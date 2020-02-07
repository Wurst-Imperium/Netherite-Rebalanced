/*
 * Copyright (C) 2020 | Alexander01998 | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteToolMaterial implements ToolMaterial
{
	@Override
	public int getDurability()
	{
		return 3264;
	}
	
	@Override
	public float getMiningSpeed()
	{
		return 11;
	}
	
	@Override
	public float getAttackDamage()
	{
		return 5;
	}
	
	@Override
	public int getMiningLevel()
	{
		return 4;
	}
	
	@Override
	public int getEnchantability()
	{
		return 16;
	}
	
	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.ofItems(Items.NETHERITE_INGOT);
	}
	
}

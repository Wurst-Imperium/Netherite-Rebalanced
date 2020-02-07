/*
 * Copyright (C) 2020 | Alexander01998 | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite.mixin;

import java.util.Set;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.wurstclient.netherite.mixinterface.IAxeItem;

@Mixin(AxeItem.class)
public class AxeItemMixin extends MiningToolItem implements IAxeItem
{
	@Shadow
	@Final
	private static Set<Block> EFFECTIVE_BLOCKS;
	
	public AxeItemMixin(ToolMaterial material, float attackDamage,
		float attackSpeed, Item.Settings settings)
	{
		super(attackDamage, attackSpeed, material, EFFECTIVE_BLOCKS, settings);
	}
	
	@Override
	public IAxeItem create(ToolMaterial material, float attackDamage,
		float attackSpeed, Settings settings)
	{
		return new AxeItemMixin(material, attackDamage, attackSpeed, settings);
	}
}

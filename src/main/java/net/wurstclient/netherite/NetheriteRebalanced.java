/*
 * Copyright (C) 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wurstclient.netherite.mixinterface.IAxeItem;
import net.wurstclient.netherite.mixinterface.IPickaxeItem;

public enum NetheriteRebalanced
{
	INSTANCE;
	
	public static final String VERSION = "1.0";
	
	public static final NetheriteToolMaterial NETHERITE_TOOL =
		new NetheriteToolMaterial();
	
	public static Item NETHERITE_SWORD;
	public static Item NETHERITE_SHOVEL;
	public static Item NETHERITE_PICKAXE;
	public static Item NETHERITE_AXE;
	public static Item NETHERITE_HOE;
	
	public static Item NETHERITE_HELMET;
	public static Item NETHERITE_CHESTPLATE;
	public static Item NETHERITE_LEGGINGS;
	public static Item NETHERITE_BOOTS;
	
	public void initialize()
	{
		System.out.println("Starting Netherite Rebalanced...");
		
		NETHERITE_SWORD =
			register("netherite_sword", new SwordItem(NETHERITE_TOOL, 3, -2.4F,
				new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
		
		NETHERITE_SHOVEL =
			register("netherite_shovel", new ShovelItem(NETHERITE_TOOL, 1.5F,
				-3.0F, new Item.Settings().group(ItemGroup.TOOLS).fireproof()));
		
		NETHERITE_PICKAXE = register("netherite_pickaxe",
			(PickaxeItem)((IPickaxeItem)Items.DIAMOND_PICKAXE).create(
				NETHERITE_TOOL, 1, -2.8F,
				new Item.Settings().group(ItemGroup.TOOLS).fireproof()));
		
		NETHERITE_AXE = register("netherite_axe",
			(AxeItem)((IAxeItem)Items.DIAMOND_AXE).create(NETHERITE_TOOL, 5.0F,
				-3.0F, new Item.Settings().group(ItemGroup.TOOLS).fireproof()));
		
		NETHERITE_HOE = register("netherite_hoe", new HoeItem(NETHERITE_TOOL,
			0.0F, new Item.Settings().group(ItemGroup.TOOLS).fireproof()));
		
		NETHERITE_HELMET = register("netherite_helmet",
			new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD,
				new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
		
		NETHERITE_CHESTPLATE = register("netherite_chestplate",
			new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST,
				new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
		
		NETHERITE_LEGGINGS = register("netherite_leggings",
			new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS,
				new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
		
		NETHERITE_BOOTS = register("netherite_boots",
			new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET,
				new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
	}
	
	private static Item register(String id, Item item)
	{
		Identifier identifier = new Identifier("minecraft", id);
		int rawId = Registry.ITEM.getRawId(Registry.ITEM.get(identifier));
		return Registry.ITEM.set(rawId, identifier, item);
	}
}

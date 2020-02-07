/*
 * Copyright (C) 2020 | Alexander01998 | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite.mixinterface;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public interface IPickaxeItem
{
	public IPickaxeItem create(ToolMaterial material, int attackDamage,
		float attackSpeed, Item.Settings settings);
}

/*
 * Copyright (C) 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.GlassBlock;
import net.wurstclient.netherite.NetheriteRebalanced;

@Mixin(GlassBlock.class)
public class GlassBlockMixin extends AbstractGlassBlock
{
	private GlassBlockMixin(NetheriteRebalanced moGlass, Settings block$Settings_1)
	{
		super(block$Settings_1);
	}
}

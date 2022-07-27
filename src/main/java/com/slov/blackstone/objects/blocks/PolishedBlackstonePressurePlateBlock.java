package com.slov.blackstone.objects.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.material.Material;

public class PolishedBlackstonePressurePlateBlock extends PressurePlateBlock {

	public PolishedBlackstonePressurePlateBlock() {
		super(PressurePlateBlock.Sensitivity.MOBS,
				Properties.create(Material.ROCK).doesNotBlockMovement().hardnessAndResistance(0.5F));
	}

}

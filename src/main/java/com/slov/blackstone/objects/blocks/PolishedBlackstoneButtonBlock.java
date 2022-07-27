package com.slov.blackstone.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.Material;

public class PolishedBlackstoneButtonBlock extends StoneButtonBlock {

	public PolishedBlackstoneButtonBlock() {
		super(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F));
	}

}

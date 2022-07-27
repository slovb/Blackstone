package com.slov.blackstone.objects.blocks;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;

public class BlackstoneWallBlock extends WallBlock {

	public BlackstoneWallBlock() {
		super(Block.Properties.from(ModBlocks.BLACKSTONE.get()));
	}

}

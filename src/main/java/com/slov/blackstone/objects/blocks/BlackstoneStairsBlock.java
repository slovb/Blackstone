package com.slov.blackstone.objects.blocks;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.block.Block;

import net.minecraft.block.StairsBlock;

public class BlackstoneStairsBlock extends StairsBlock {

	public BlackstoneStairsBlock() {
		super(() -> ModBlocks.BLACKSTONE.get().getDefaultState(), Block.Properties.from(ModBlocks.BLACKSTONE.get()));
	}

}

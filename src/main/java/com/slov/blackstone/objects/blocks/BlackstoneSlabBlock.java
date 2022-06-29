package com.slov.blackstone.objects.blocks;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class BlackstoneSlabBlock extends SlabBlock {
	
	public BlackstoneSlabBlock() {
		super(Block.Properties.from(ModBlocks.BLACKSTONE.get()));
	}

}

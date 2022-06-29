package com.slov.blackstone.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackstoneBlock extends Block {
	
	public BlackstoneBlock() {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F));
	}

}

package com.slov.blackstone.init;

import com.slov.blackstone.Blackstone;
import com.slov.blackstone.objects.blocks.BlackstoneBlock;
import com.slov.blackstone.objects.blocks.BlackstoneSlabBlock;
import com.slov.blackstone.objects.blocks.BlackstoneStairsBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Blackstone.MODID);
	
	public static final RegistryObject<Block> BLACKSTONE = BLOCKS.register("blackstone", BlackstoneBlock::new);
	public static final RegistryObject<Block> BLACKSTONE_SLAB = BLOCKS.register("blackstone_slab", BlackstoneSlabBlock::new);
	public static final RegistryObject<Block> BLACKSTONE_STAIRS = BLOCKS.register("blackstone_stairs", BlackstoneStairsBlock::new);
}

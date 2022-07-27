package com.slov.blackstone.init;

import com.slov.blackstone.Blackstone;
import com.slov.blackstone.objects.blocks.BlackstoneBlock;
import com.slov.blackstone.objects.blocks.PolishedBlackstoneButtonBlock;
import com.slov.blackstone.objects.blocks.PolishedBlackstonePressurePlateBlock;
import com.slov.blackstone.objects.blocks.BlackstoneSlabBlock;
import com.slov.blackstone.objects.blocks.BlackstoneStairsBlock;
import com.slov.blackstone.objects.blocks.BlackstoneWallBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Blackstone.MODID);
	
	public static final RegistryObject<Block> BLACKSTONE = BLOCKS.register("blackstone", BlackstoneBlock::new);
	public static final RegistryObject<Block> BLACKSTONE_SLAB = BLOCKS.register("blackstone_slab", BlackstoneSlabBlock::new);
	public static final RegistryObject<Block> BLACKSTONE_STAIRS = BLOCKS.register("blackstone_stairs", BlackstoneStairsBlock::new);
	public static final RegistryObject<Block> BLACKSTONE_WALL = BLOCKS.register("blackstone_wall", BlackstoneWallBlock::new);
	
	public static final RegistryObject<Block> POLISHED_BLACKSTONE = BLOCKS.register("polished_blackstone", BlackstoneBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_SLAB = BLOCKS.register("polished_blackstone_slab", BlackstoneSlabBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_STAIRS = BLOCKS.register("polished_blackstone_stairs", BlackstoneStairsBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_WALL = BLOCKS.register("polished_blackstone_wall", BlackstoneWallBlock::new);

	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("polished_blackstone_bricks", BlackstoneBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("polished_blackstone_brick_slab", BlackstoneSlabBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("polished_blackstone_brick_stairs", BlackstoneStairsBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS.register("polished_blackstone_brick_wall", BlackstoneWallBlock::new);
	
	public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE = BLOCKS.register("chiseled_polished_blackstone", BlackstoneBlock::new);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("cracked_polished_blackstone_bricks", BlackstoneBlock::new);
	public static final RegistryObject<Block> GILDED_BLACKSTONE = BLOCKS.register("gilded_blackstone", BlackstoneBlock::new);
	
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BUTTON = BLOCKS.register("polished_blackstone_button", PolishedBlackstoneButtonBlock::new);
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_PRESSURE_PLATE = BLOCKS.register("polished_blackstone_pressure_plate", PolishedBlackstonePressurePlateBlock::new);
}

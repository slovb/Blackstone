package com.slov.blackstone.init;

import com.slov.blackstone.Blackstone;
import com.slov.blackstone.objects.items.PolishedBlackstoneButtonItem;
import com.slov.blackstone.objects.items.BlackstoneItem;
import com.slov.blackstone.objects.items.PolishedBlackstonePressurePlateItem;
import com.slov.blackstone.objects.items.BlackstoneSlabItem;
import com.slov.blackstone.objects.items.BlackstoneStairsItem;
import com.slov.blackstone.objects.items.BlackstoneWallItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Blackstone.MODID);
	
	public static final RegistryObject<Item> BLACKSTONE = ITEMS.register("blackstone", () -> new BlackstoneItem(ModBlocks.BLACKSTONE.get()));
	public static final RegistryObject<Item> BLACKSTONE_SLAB = ITEMS.register("blackstone_slab", () -> new BlackstoneSlabItem(ModBlocks.BLACKSTONE_SLAB.get()));
	public static final RegistryObject<Item> BLACKSTONE_STAIRS = ITEMS.register("blackstone_stairs", () -> new BlackstoneStairsItem(ModBlocks.BLACKSTONE_STAIRS.get()));
	public static final RegistryObject<Item> BLACKSTONE_WALL = ITEMS.register("blackstone_wall", () -> new BlackstoneWallItem(ModBlocks.BLACKSTONE_WALL.get()));

	public static final RegistryObject<Item> POLISHED_BLACKSTONE = ITEMS.register("polished_blackstone", () -> new BlackstoneItem(ModBlocks.POLISHED_BLACKSTONE.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_SLAB = ITEMS.register("polished_blackstone_slab", () -> new BlackstoneSlabItem(ModBlocks.POLISHED_BLACKSTONE_SLAB.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_STAIRS = ITEMS.register("polished_blackstone_stairs", () -> new BlackstoneStairsItem(ModBlocks.POLISHED_BLACKSTONE_STAIRS.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_WALL = ITEMS.register("polished_blackstone_wall", () -> new BlackstoneWallItem(ModBlocks.POLISHED_BLACKSTONE_WALL.get()));
	
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS = ITEMS.register("polished_blackstone_bricks", () -> new BlackstoneItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICK_SLAB = ITEMS.register("polished_blackstone_brick_slab", () -> new BlackstoneSlabItem(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICK_STAIRS = ITEMS.register("polished_blackstone_brick_stairs", () -> new BlackstoneStairsItem(ModBlocks.POLISHED_BLACKSTONE_BRICK_STAIRS.get()));
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICK_WALL = ITEMS.register("polished_blackstone_brick_wall", () -> new BlackstoneWallItem(ModBlocks.POLISHED_BLACKSTONE_BRICK_WALL.get()));
	
	public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE = ITEMS.register("chiseled_polished_blackstone", () -> new BlackstoneItem(ModBlocks.CHISELED_POLISHED_BLACKSTONE.get()));
	public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS = ITEMS.register("cracked_polished_blackstone_bricks", () -> new BlackstoneItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.get()));
	public static final RegistryObject<Item> GILDED_BLACKSTONE = ITEMS.register("gilded_blackstone", () -> new BlackstoneItem(ModBlocks.GILDED_BLACKSTONE.get()));
	
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_BUTTON = ITEMS.register("polished_blackstone_button", PolishedBlackstoneButtonItem::new);
	public static final RegistryObject<Item> POLISHED_BLACKSTONE_PRESSURE_PLATE = ITEMS.register("polished_blackstone_pressure_plate", PolishedBlackstonePressurePlateItem::new);
}

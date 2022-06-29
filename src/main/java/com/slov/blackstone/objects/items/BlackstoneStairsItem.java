package com.slov.blackstone.objects.items;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlackstoneStairsItem extends BlockNamedItem {

	public BlackstoneStairsItem() {
		super(ModBlocks.BLACKSTONE_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}

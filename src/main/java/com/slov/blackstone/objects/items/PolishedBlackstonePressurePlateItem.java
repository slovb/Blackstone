package com.slov.blackstone.objects.items;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PolishedBlackstonePressurePlateItem extends BlockNamedItem {

	public PolishedBlackstonePressurePlateItem() {
		super(ModBlocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}

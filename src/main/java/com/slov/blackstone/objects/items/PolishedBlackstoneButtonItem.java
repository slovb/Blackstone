package com.slov.blackstone.objects.items;

import com.slov.blackstone.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PolishedBlackstoneButtonItem extends BlockNamedItem {

	public PolishedBlackstoneButtonItem() {
		super(ModBlocks.POLISHED_BLACKSTONE_BUTTON.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}

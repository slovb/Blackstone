package com.slov.blackstone.objects.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlackstoneItem extends BlockNamedItem {

	public BlackstoneItem(Block blockIn) {
		super(blockIn, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}

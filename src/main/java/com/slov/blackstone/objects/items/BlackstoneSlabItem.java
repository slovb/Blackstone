package com.slov.blackstone.objects.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlackstoneSlabItem extends BlockNamedItem {

	public BlackstoneSlabItem(Block blockIn) {
		super(blockIn, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}

package com.slov.blackstone.init;

import com.slov.blackstone.Blackstone;
import com.slov.blackstone.objects.items.BlackstoneItem;
import com.slov.blackstone.objects.items.BlackstoneSlabItem;
import com.slov.blackstone.objects.items.BlackstoneStairsItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Blackstone.MODID);
	
	public static final RegistryObject<Item> BLACKSTONE = ITEMS.register("blackstone", BlackstoneItem::new);
	public static final RegistryObject<Item> BLACKSTONE_SLAB = ITEMS.register("blackstone_slab", BlackstoneSlabItem::new);
	public static final RegistryObject<Item> BLACKSTONE_STAIRS = ITEMS.register("blackstone_stairs", BlackstoneStairsItem::new);
}

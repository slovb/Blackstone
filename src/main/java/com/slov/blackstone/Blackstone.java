package com.slov.blackstone;

import com.slov.blackstone.init.ModBlocks;
import com.slov.blackstone.init.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Blackstone.MODID)
public class Blackstone
{
	public static final String MODID = "blackstone";

    public Blackstone() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ModBlocks.BLOCKS.register(bus);
    	ModItems.ITEMS.register(bus);
    }
}

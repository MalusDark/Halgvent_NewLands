package net.malus.halgvent;

import net.fabricmc.api.ModInitializer;

import net.malus.halgvent.block.HalgventBlocks;
import net.malus.halgvent.block.RockItemGroup;
import net.malus.halgvent.block.WoodItemGroup;
import net.malus.halgvent.datagen.HalgventDataGenerator;
import net.malus.halgvent.generator.HalgventWorldGenerator;
import net.malus.halgvent.items.HalgventItems;
import net.malus.halgvent.util.HalgventWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Halgvent_Newlands implements ModInitializer
{
	public static final String MOD_ID = "halgvent_newlands";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		RockItemGroup.registerRockGroup();
		WoodItemGroup.registerWoodGroup();
		HalgventItems.registerModItems();
		HalgventBlocks.registerHalgventBlocks();

		HalgventWorldGeneration.generateModWorldGen();
	}
}
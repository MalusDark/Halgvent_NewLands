package net.malus.halgvent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.malus.halgvent.block.HalgventBlocks;

public class ModLootTableProvider  extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        addDrop(HalgventBlocks.KIANITE_ORE);


    }
}

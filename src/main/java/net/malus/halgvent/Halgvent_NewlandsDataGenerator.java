package net.malus.halgvent;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.malus.halgvent.world.HalgventConfiguredFeature;
import net.malus.halgvent.world.HalgventPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class Halgvent_NewlandsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, HalgventConfiguredFeature::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, HalgventPlacedFeatures::boostrap);
	}
}

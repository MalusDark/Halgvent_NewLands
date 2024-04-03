package net.malus.halgvent.world;

import net.malus.halgvent.Halgvent_Newlands;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class HalgventPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> KIANITE_ORE_PLACED_KEY = registerKey("kianite_ore_placed_key");

    public static RegistryKey<PlacedFeature> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Halgvent_Newlands.MOD_ID, name));
    }
    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    public static void boostrap(Registerable<PlacedFeature> context)
    {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, KIANITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(HalgventConfiguredFeature.KIANITE_ORE_KEY),
                HalgventOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    }
}

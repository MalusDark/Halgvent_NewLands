package net.malus.halgvent.world;

import net.malus.halgvent.Halgvent_Newlands;
import net.malus.halgvent.block.HalgventBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class HalgventConfiguredFeature
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> KIANITE_ORE_KEY = registerKey("kianite_ore");
    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceble = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatesReplaceble = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldKianiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceble, HalgventBlocks.KIANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslatesReplaceble, HalgventBlocks.KIANITE_ORE.getDefaultState()));

        register(context, KIANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldKianiteOres, 12));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Halgvent_Newlands.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

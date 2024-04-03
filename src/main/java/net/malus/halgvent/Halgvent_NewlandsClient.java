package net.malus.halgvent;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.malus.halgvent.block.HalgventBlocks;
import net.minecraft.client.render.RenderLayer;

public class Halgvent_NewlandsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASH_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.APPLE_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASH_TREE_SAPLING_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASPEN_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASPEN_TREE_SAPLING_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.BEECH_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.BEECH_TREE_SAPLING_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.CEDER_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.NORTHPINE_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.PEAR_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.PINE_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.WILLOW_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.WILLOW_TREE_SAPLING_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.BOLOTNIK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.BOROVICHOK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.CHERNOBYLLINIK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.DWARF_BIRCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.HEATHER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.IVANCHAY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.KOVYL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.LEBEDA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.LOBELIA_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.MUHOMOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.NORTH_LICHEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.OMELA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.POGANKA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.PUSHICA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.RAZRYV_TRAVA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.RED_SPHAGNUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.SPHAGNUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.WOLFSBANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.AUTUMNAL_BRACKEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.BIRCH_WOOD_WINDOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.CEDER_NEEDLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.AUTUMNAL_ASPEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASPEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.NORTHPINE_NEEDLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.PINE_NEEDLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.APPLE_TREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.PEAR_TREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HalgventBlocks.WEEPING_WILLOW_LEAVES, RenderLayer.getCutout());
    }
}

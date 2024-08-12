package com.hijpixel.supplements.provider;

import com.hijpixel.supplements.PixelsSupplements;
import com.hijpixel.supplements.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class SupplementsBlocksTagProvider extends FabricTagProvider.BlockTagProvider {
    public SupplementsBlocksTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> SUPPLEMENTS_BLOCKS_TAG = TagKey.of(RegistryKeys.BLOCK, PixelsSupplements.id("supplements_blocks"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(BlockInit.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(SUPPLEMENTS_BLOCKS_TAG)
                .add(BlockInit.ROSE_GOLD_BLOCK);
    }
}

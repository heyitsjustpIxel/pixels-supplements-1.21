package com.hijpixel.supplements.lists;

import com.hijpixel.supplements.PixelsSupplements;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagsList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_ROSE_GOLD_TOOL =
                TagKey.of(RegistryKeys.BLOCK, PixelsSupplements.id( "incorrect_for_rose_gold_tool"));
    }
}

package com.hijpixel.supplements.lists;

import com.hijpixel.supplements.PixelsSupplements;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagsList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_ROSE_GOLD_TOOL =
                TagKey.of(RegistryKeys.BLOCK, PixelsSupplements.id( "incorrect_for_rose_gold_tool"));
    }
    public static class ToolItem {
        public static final TagKey<Item> BATTLEAXE_TOOL =
                TagKey.of(RegistryKeys.ITEM, PixelsSupplements.id("battleaxe_tool"));
    }
}

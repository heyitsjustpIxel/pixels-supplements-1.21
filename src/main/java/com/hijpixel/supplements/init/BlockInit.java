package com.hijpixel.supplements.init;

import com.hijpixel.supplements.PixelsSupplements;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class BlockInit  {
    public static final Block ROSE_GOLD_BLOCK = register("rose_gold_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));


    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, PixelsSupplements.id(name), block);
            }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {

    }
}

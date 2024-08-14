package com.hijpixel.supplements.init;

import com.hijpixel.supplements.PixelsSupplements;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupsInit {
    public static final Text SUPPLEMENTS =
            Text.translatable("itemGroup." + PixelsSupplements.MOD_ID + ".supplements");

    public static final ItemGroup PIXELS_SUPPLEMENTS =
            register("pixels_supplements", FabricItemGroup.builder()
                    .displayName(SUPPLEMENTS)
                    .icon(ItemInit.ROSE_GOLD_BLOCK::getDefaultStack)
                    .entries(((displayContext, entries) -> Registries.ITEM.getIds()
                            .stream()
                            .filter(key -> key.getNamespace().equals(PixelsSupplements.MOD_ID))
                            .map(Registries.ITEM::getOrEmpty)
                            .map(Optional::orElseThrow)
                            .filter(item -> !ItemInit.BLACKLIST.contains(item))
                            .forEach(entries::add)))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, PixelsSupplements.id(name), itemGroup);
    }

    public static void load() {}
}

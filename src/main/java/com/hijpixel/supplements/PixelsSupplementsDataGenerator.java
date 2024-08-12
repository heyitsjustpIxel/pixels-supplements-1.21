package com.hijpixel.supplements;

import com.hijpixel.supplements.provider.SupplementsBlockLootProvider;
import com.hijpixel.supplements.provider.SupplementsTagProvider;
import com.hijpixel.supplements.provider.lang.PixelsSupplementsEnglishLanguageProvider;
import com.hijpixel.supplements.provider.PixelsSupplementsModelProvider;
import com.hijpixel.supplements.provider.SupplementsRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PixelsSupplementsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PixelsSupplementsModelProvider::new);
		pack.addProvider(PixelsSupplementsEnglishLanguageProvider::new);
		pack.addProvider(SupplementsRecipeGenerator::new);
		pack.addProvider(SupplementsBlockLootProvider::new);
		pack.addProvider(SupplementsTagProvider::new);
	}
}

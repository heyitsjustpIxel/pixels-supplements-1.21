package com.hijpixel.supplements.lists;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    //Orange
    public static final FoodComponent ORANGE = (new FoodComponent.Builder())
            .nutrition(5)
            .saturationModifier(0.4F)
            .build();

    //Pepper
    public static final FoodComponent PEPPER = (new FoodComponent.Builder())
            .nutrition(2)
            .saturationModifier(0.1F)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 0.25F)
            .build();

    //Diamond Apple
    public static final FoodComponent DIAMOND_APPLE = (new FoodComponent.Builder())
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1800, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 5, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 3), 1.0F)
            .alwaysEdible()
    .build();
}

package net.fabricmc.lotstuffs.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LapisLazuli implements ToolMaterial {
    @Override
    public int getDurability() {
        return 270;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5f;
    }

    @Override
    public float getAttackDamage() {
        return 6.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LAPIS_LAZULI);
    }
}

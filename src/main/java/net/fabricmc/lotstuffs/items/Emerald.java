package net.fabricmc.lotstuffs.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Emerald implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5f;
    }

    @Override
    public float getAttackDamage() {
        return 7.5f;
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
        return Ingredient.ofItems(Items.EMERALD);
    }
}

package net.fabricmc.lotstuffs.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Amethyst implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1900;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.9f;
    }

    @Override
    public float getAttackDamage() {
        return 7.9f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 40;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }
}

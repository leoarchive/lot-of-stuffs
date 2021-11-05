package net.fabricmc.lotstuffs.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Quartz implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7f;
    }

    @Override
    public float getAttackDamage() {
        return 7.1f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.QUARTZ);
    }
}

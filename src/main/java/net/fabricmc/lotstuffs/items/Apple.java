package net.fabricmc.lotstuffs.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Apple implements ToolMaterial {
    @Override
    public int getDurability() {
        return 999999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 999999;
    }

    @Override
    public float getAttackDamage() {
        return 999999;
    }

    @Override
    public int getMiningLevel() {
        return 999999;
    }

    @Override
    public int getEnchantability() {
        return 999999;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.APPLE);
    }
}

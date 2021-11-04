package net.fabricmc.swordsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.swordsmod.items.Coal;
import net.fabricmc.swordsmod.items.LapisLazuli;
import net.fabricmc.swordsmod.items.Redstone;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Item REDSTONE_SWORD = new SwordItem(new Redstone(), 3, -2.3f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item LAPISLAZULI_SWORD = new SwordItem(new LapisLazuli(), 3, -2.0f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item COAL_SWORD = new SwordItem(new Coal(), 1, -3.0f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item COPPER_SWORD = new SwordItem(new Coal(), 3, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("swordsmod", "redstone_sword"), REDSTONE_SWORD);
		Registry.register(Registry.ITEM, new Identifier("swordsmod", "lapislazuli_sword"), LAPISLAZULI_SWORD);
		Registry.register(Registry.ITEM, new Identifier("swordsmod", "coal_sword"), COAL_SWORD);
		Registry.register(Registry.ITEM, new Identifier("swordsmod", "copper_sword"), COPPER_SWORD);
	}
}

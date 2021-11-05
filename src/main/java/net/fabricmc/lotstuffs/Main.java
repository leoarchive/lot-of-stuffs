package net.fabricmc.lotstuffs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.lotstuffs.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Item REDSTONE_SWORD = new SwordItem(new Redstone(), 3, -2.3f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item LAPISLAZULI_SWORD = new SwordItem(new LapisLazuli(), 3, -2.0f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item COAL_SWORD = new SwordItem(new Coal(), 1, -3.0f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item COPPER_SWORD = new SwordItem(new Copper(), 3, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item EMERALD_SWORD = new SwordItem(new Emerald(), 3, -3.2f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item AMETHYST_SWORD = new SwordItem(new Amethyst(), 3, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item QUARTZ_SWORD = new SwordItem(new Quartz(), 3, +1f, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item APPLE_SWORD = new SwordItem(new Apple(), 999999, +9999999f, new FabricItemSettings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "redstone_sword"), REDSTONE_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "lapislazuli_sword"), LAPISLAZULI_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "coal_sword"), COAL_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "copper_sword"), COPPER_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "amethyst_sword"), AMETHYST_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "quartz_sword"), QUARTZ_SWORD);
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "apple_sword"), APPLE_SWORD);
	}
}

package net.fabricmc.lotstuffs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.lotstuffs.items.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Item REDSTONE_SWORD = new SwordBase(new Redstone());
	public static final Item LAPISLAZULI_SWORD = new SwordBase(new LapisLazuli());
	public static final Item COAL_SWORD = new SwordBase(new Coal());
	public static final Item COPPER_SWORD = new SwordBase(new Copper());
	public static final Item EMERALD_SWORD = new SwordBase(new Emerald());
	public static final Item AMETHYST_SWORD = new SwordBase(new Amethyst());
	public static final Item QUARTZ_SWORD = new SwordBase(new Quartz());
	public static final Item APPLE_SWORD = new SwordBase(new Apple());
	public static final Item REDSTONE_PICKAXE = new PickaxeBase(new Redstone());

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
		Registry.register(Registry.ITEM, new Identifier("lotstuffs", "redstone_pickaxe"), REDSTONE_PICKAXE);
	}
}

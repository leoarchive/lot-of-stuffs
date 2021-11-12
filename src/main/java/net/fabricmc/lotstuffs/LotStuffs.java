package net.fabricmc.lotstuffs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.lotstuffs.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class LotStuffs implements ModInitializer {
	public static final String MOD_ID = "lotstuffs";
	public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "lotstuffs"), () -> new ItemStack(ModItems.APPLE_SWORD));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}

package com.mchak.mchakcraft;

import com.mchak.mchakcraft.item.BaseItem;
import com.mchak.mchakcraft.item.custom.InfernoShardItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

	//public static final Item SUSPICIOUS_SUBSTANCE = register("suspicious_substance", BaseItem::new, new Item.Settings());
	public static final Item INFERNO_SHARD = register("inferno_shard", InfernoShardItem::new, new Item.Settings());

	public static Item register(String name, Function<Item.Settings, BaseItem> itemFactory, Item.Settings settings) {
		// Create the item key
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("mchakcraft", name));

		// Create the item instance
		BaseItem item = itemFactory.apply(settings.registryKey(itemKey));

		// Register the item
		Registry.register(Registries.ITEM, itemKey, item);

		Mchakcraft.ITEMS.add(item);
		return item;
	}

	public static void initialize() {
		for (var item : Mchakcraft.ITEMS) {
			item.init();
		}

		// Suspicious Substance
		/*
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
				.register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE));
		CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 0.3f);
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.SUSPICIOUS_SUBSTANCE, 30 * 20);
		});
		*/
	}
}

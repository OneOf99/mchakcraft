package com.mchak.mchakcraft.item.custom;

import com.mchak.mchakcraft.ModItems;
import com.mchak.mchakcraft.item.BaseItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.ItemGroups;

public class InfernoShardItem extends BaseItem {
	public InfernoShardItem(Settings settings) {
		super(settings);
	}

	@Override
	public void init() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
				.register((itemGroup) -> itemGroup.add(ModItems.INFERNO_SHARD));

		FuelRegistryEvents.BUILD.register((builder, context) ->
			builder.add(this, 120 * 20)
		);
	}
}

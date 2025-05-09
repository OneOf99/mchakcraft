package com.mchak.mchakcraft;

import com.mchak.mchakcraft.item.BaseItem;
import net.fabricmc.api.ModInitializer;

import java.util.ArrayList;
import java.util.List;

public class Mchakcraft implements ModInitializer {
	public static List<BaseItem> ITEMS = new ArrayList<>();

	@Override
	public void onInitialize() {
        ModItems.initialize();

	}
}

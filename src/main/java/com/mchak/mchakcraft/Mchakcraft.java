package com.mchak.mchakcraft;

import net.fabricmc.api.ModInitializer;

public class Mchakcraft implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("FEGLI");
        ModItems.initialize();

	}
}

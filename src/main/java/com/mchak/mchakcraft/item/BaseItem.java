package com.mchak.mchakcraft.item;

import net.minecraft.item.Item;

public abstract class BaseItem extends Item {

	public BaseItem(Settings settings) {
		super(settings);
	}


	public abstract void init();
}

package com.binglan.upandaway.items;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.item.Item;

public class ItemNBStar extends Item{
	
	public ItemNBStar() {
		setRegistryName(UpAndAwayInfo.MOD_ID, "niubistar");
		setUnlocalizedName("niubistar");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}

}

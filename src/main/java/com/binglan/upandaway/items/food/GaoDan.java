package com.binglan.upandaway.items.food;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.item.ItemFood;

public class GaoDan extends ItemFood{
	
	public GaoDan(int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setRegistryName(UpAndAwayInfo.MOD_ID, "danbai_gaodan");
		setUnlocalizedName("danbai_gaodan");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	

}

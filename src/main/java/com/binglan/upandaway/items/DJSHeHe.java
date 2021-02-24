package com.binglan.upandaway.items;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class DJSHeHe extends ItemSpade{
	
	public DJSHeHe(Item.ToolMaterial material) {
		
		super(material);
		setRegistryName(UpAndAwayInfo.MOD_ID, "dongjuns_hehe");
		setUnlocalizedName("dongjuns_hehe");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		
		
	}

}

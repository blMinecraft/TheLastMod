package com.binglan.upandaway.items;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class DJSTmd extends ItemAxe{
	


	public DJSTmd(Item.ToolMaterial material) {
		
		super(material, 1, 1);
		setRegistryName(UpAndAwayInfo.MOD_ID, "dongjuns_tm");
		setUnlocalizedName("dongjuns_tm");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
		
	
	

}

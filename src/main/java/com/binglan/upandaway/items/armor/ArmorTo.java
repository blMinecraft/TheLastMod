package com.binglan.upandaway.items.armor;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorTo extends ItemArmor{

	public ArmorTo(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(UpAndAwayInfo.MOD_ID, "upandaway_tou");
		setUnlocalizedName("upandaway_tou");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		
	}
	
	

}

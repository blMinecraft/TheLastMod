package com.binglan.upandaway.items.armor;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorXu extends ItemArmor{

	public ArmorXu(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(UpAndAwayInfo.MOD_ID, "upandaway_xue");
		setUnlocalizedName("upandaway_xue");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	

}

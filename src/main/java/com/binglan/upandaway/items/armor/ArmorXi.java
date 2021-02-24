package com.binglan.upandaway.items.armor;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorXi extends ItemArmor{

	public ArmorXi(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(UpAndAwayInfo.MOD_ID, "upandaway_xiong");
		setUnlocalizedName("upandaway_xiong");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	

}

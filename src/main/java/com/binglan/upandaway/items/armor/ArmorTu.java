package com.binglan.upandaway.items.armor;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorTu extends ItemArmor{

	public ArmorTu(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(UpAndAwayInfo.MOD_ID, "upandaway_tui");
		setUnlocalizedName("upandaway_tui");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	

}

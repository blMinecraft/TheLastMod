package com.binglan.upandaway.items;

import java.util.List;

import javax.annotation.Nullable;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class DJSGiaoZi extends ItemPickaxe{
	
	public DJSGiaoZi(Item.ToolMaterial material) {
		
		super(material);
		setRegistryName(UpAndAwayInfo.MOD_ID, "dongjuns_giaozi");
		setUnlocalizedName("dongjuns_giaozi");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		
		
	}

	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
	
		if(stack.getItem() instanceof DJSGiaoZi);
		tooltip.add("Giao~");
	}

}

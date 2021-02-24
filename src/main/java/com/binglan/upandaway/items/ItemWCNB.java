package com.binglan.upandaway.items;

import java.util.List;

import javax.annotation.Nullable;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWCNB extends Item{
	
	public ItemWCNB() {
		setRegistryName(UpAndAwayInfo.MOD_ID, "wocaonb");
		setUnlocalizedName("wocaonb");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		if(stack.getItem() instanceof ItemWCNB);
			tooltip.add("It's very NB!");
		
	}
}

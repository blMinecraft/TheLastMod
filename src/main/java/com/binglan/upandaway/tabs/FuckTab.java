package com.binglan.upandaway.tabs;

import com.binglan.upandaway.init.TheLastModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuckTab extends CreativeTabs{
	
	public FuckTab() {
		
		super("upandaway_tab");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(TheLastModItem.UPANDAWAY);
		
	}

}

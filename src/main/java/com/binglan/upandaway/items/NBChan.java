package com.binglan.upandaway.items;

import java.util.List;

import javax.annotation.Nullable;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NBChan extends ItemSpade{
	
	public NBChan(Item.ToolMaterial material) {
		
		super(material);
		setRegistryName(UpAndAwayInfo.MOD_ID, "nbzhi_chan");
		setUnlocalizedName("nbzhi_chan");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		
		
	}
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		if(stack.getItem() instanceof NBChan);
			tooltip.add("There's no axe because the sword can be used as axe.");
}

}

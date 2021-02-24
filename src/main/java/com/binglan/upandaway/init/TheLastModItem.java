package com.binglan.upandaway.init;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.items.DJSCao;
import com.binglan.upandaway.items.DJSGiaoZi;
import com.binglan.upandaway.items.DJSHeHe;
import com.binglan.upandaway.items.DJSTmd;
import com.binglan.upandaway.items.ItemNBStar;
import com.binglan.upandaway.items.ItemTWS;
import com.binglan.upandaway.items.ItemWCNB;
import com.binglan.upandaway.items.NBChan;
import com.binglan.upandaway.items.NBGiao;
import com.binglan.upandaway.items.NBSword;
import com.binglan.upandaway.items.armor.ArmorTo;
import com.binglan.upandaway.items.armor.ArmorTu;
import com.binglan.upandaway.items.armor.ArmorXi;
import com.binglan.upandaway.items.armor.ArmorXu;
import com.binglan.upandaway.items.food.GaoDan;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = UpAndAwayInfo.MOD_ID)
public class TheLastModItem {
	
	//用于合成(材料)
	public static final Item WOCAONB = new ItemWCNB();
	public static final Item UPANDAWAY = new ItemTWS();
	public static final Item NIUBISTAR = new ItemNBStar();
	//工具材料
	private static final Item.ToolMaterial UPANDAWAY_MATERIAL = EnumHelper.addToolMaterial("upandaway_material", 3, 2500, 10.0f, 5.0f, 25);
	private static final Item.ToolMaterial WOCAO_NB = EnumHelper.addToolMaterial("wocao_nb", 4, 99999999, 99.0f, 50.0f, 50);
	//盔甲材料
	public static final ArmorMaterial UPANDAWAY_ARMOR = EnumHelper.addArmorMaterial("upandaway_armor", UpAndAwayInfo.MOD_ID + ":upandaway", 30, new int[] {4,7,9,4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
	//DJ的工具
	public static final ItemSword DONGJUNSCAO = new DJSCao(UPANDAWAY_MATERIAL);
	public static final ItemPickaxe DONGJUNSGIAOZI = new DJSGiaoZi(UPANDAWAY_MATERIAL);
	public static final ItemAxe DONGJUNSTMD = new DJSTmd(UPANDAWAY_MATERIAL);
	public static final ItemSpade DONGJUNSHEHE = new DJSHeHe(UPANDAWAY_MATERIAL);
	//牛逼工具
	public static final ItemAxe NBZHISWORD = new NBSword(WOCAO_NB);
	public static final ItemPickaxe NBZHIGIAO = new NBGiao(WOCAO_NB);
	public static final ItemSpade NBZHICHAN = new NBChan(WOCAO_NB);
	//食物
	public static final ItemFood DANBAI_GAODAN = new GaoDan(12, 1.0f, false);
	//盔甲
	public static final Item UPANDAWAY_TOU = new ArmorTo(UPANDAWAY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item UPANDAWAY_XIONG = new ArmorXi(UPANDAWAY_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item UPANDAWAY_TUI = new ArmorTu(UPANDAWAY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item UPANDAWAY_XUE = new ArmorXu(UPANDAWAY_ARMOR, 1, EntityEquipmentSlot.FEET);
	

	
	@SubscribeEvent
	public static void registerItemEvent(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
					UPANDAWAY,
					DONGJUNSCAO,
					DONGJUNSTMD,
					DONGJUNSHEHE,
					DONGJUNSGIAOZI,
					NBZHISWORD,
					DANBAI_GAODAN,
					WOCAONB,
					NIUBISTAR,
					NBZHIGIAO,
					NBZHICHAN,
					UPANDAWAY_TOU,
					UPANDAWAY_XIONG,
					UPANDAWAY_TUI,
					UPANDAWAY_XUE
				    
				);
		
	
	}
	
	@SubscribeEvent
	public static void onModelReg(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(UPANDAWAY, 0, new ModelResourceLocation(UPANDAWAY.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(DONGJUNSCAO, 0, new ModelResourceLocation(DONGJUNSCAO.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(DONGJUNSGIAOZI, 0, new ModelResourceLocation(DONGJUNSGIAOZI.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(DONGJUNSTMD, 0, new ModelResourceLocation(DONGJUNSTMD.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(DONGJUNSHEHE, 0, new ModelResourceLocation(DONGJUNSHEHE.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(NBZHISWORD, 0, new ModelResourceLocation(NBZHISWORD.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(DANBAI_GAODAN, 0, new ModelResourceLocation(DANBAI_GAODAN.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(WOCAONB, 0, new ModelResourceLocation(WOCAONB.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(NIUBISTAR, 0, new ModelResourceLocation(NIUBISTAR.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(NBZHIGIAO, 0, new ModelResourceLocation(NBZHIGIAO.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(NBZHICHAN, 0, new ModelResourceLocation(NBZHICHAN.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(UPANDAWAY_TOU, 0, new ModelResourceLocation(UPANDAWAY_TOU.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(UPANDAWAY_XIONG, 0, new ModelResourceLocation(UPANDAWAY_XIONG.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(UPANDAWAY_TUI, 0, new ModelResourceLocation(UPANDAWAY_TUI.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(UPANDAWAY_XUE, 0, new ModelResourceLocation(UPANDAWAY_XUE.getRegistryName(), "inventory"));
		
	}

}

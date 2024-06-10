
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.dovahkiin.kelip.init;

import xyz.dovahkiin.kelip.Altie122KelipMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Altie122KelipModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Altie122KelipMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KELIP = REGISTRY.register("kelip",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.altie122_kelip.kelip")).icon(() -> new ItemStack(Blocks.KELP)).displayItems((parameters, tabData) -> {
				tabData.accept(Altie122KelipModItems.COPPER_AXE.get());
				tabData.accept(Altie122KelipModItems.COPPER_PICKAXE.get());
				tabData.accept(Altie122KelipModItems.COPPER_SWORD.get());
				tabData.accept(Altie122KelipModItems.COPPER_SHOVEL.get());
				tabData.accept(Altie122KelipModItems.COPPER_HOE.get());
				tabData.accept(Altie122KelipModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(Altie122KelipModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(Altie122KelipModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(Altie122KelipModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(Altie122KelipModItems.BURNING_COAL.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(Altie122KelipModItems.BURNING_COAL_AXE.get());
		}
	}
}

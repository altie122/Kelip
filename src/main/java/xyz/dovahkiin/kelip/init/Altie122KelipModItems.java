
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.dovahkiin.kelip.init;

import xyz.dovahkiin.kelip.item.CopperSwordItem;
import xyz.dovahkiin.kelip.item.CopperShovelItem;
import xyz.dovahkiin.kelip.item.CopperPickaxeItem;
import xyz.dovahkiin.kelip.item.CopperHoeItem;
import xyz.dovahkiin.kelip.item.CopperAxeItem;
import xyz.dovahkiin.kelip.item.CopperArmorItem;
import xyz.dovahkiin.kelip.item.BurningCoalItem;
import xyz.dovahkiin.kelip.item.BurningCoalAxeItem;
import xyz.dovahkiin.kelip.Altie122KelipMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

public class Altie122KelipModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, Altie122KelipMod.MODID);
	public static final DeferredHolder<Item, Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final DeferredHolder<Item, Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final DeferredHolder<Item, Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final DeferredHolder<Item, Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final DeferredHolder<Item, Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final DeferredHolder<Item, Item> BURNING_COAL = REGISTRY.register("burning_coal", () -> new BurningCoalItem());
	public static final DeferredHolder<Item, Item> BURNING_COAL_AXE = REGISTRY.register("burning_coal_axe", () -> new BurningCoalAxeItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}

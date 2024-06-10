
package xyz.dovahkiin.kelip.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BurningCoalItem extends Item {
	public BurningCoalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

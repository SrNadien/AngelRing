package dev.denismasterherobrine.angelring.neoforge.registry_neoforge;

import dev.denismasterherobrine.angelring.AngelRing;
import dev.denismasterherobrine.angelring.neoforge.item.AngelRingItem;
import dev.denismasterherobrine.angelring.neoforge.item.DiamondRingItem;
import net.minecraft.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AngelRingRegistryNeoForge {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AngelRing.MOD_ID);

    public static final DeferredItem<Item> ANGEL_RING = ITEMS.register("angel_ring", AngelRingItem::new);
    public static final DeferredItem<Item> DIAMOND_RING = ITEMS.register("diamond_ring", DiamondRingItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

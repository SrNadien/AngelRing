package dev.denismasterherobrine.angelring.fabric.registry_fabric;

import dev.denismasterherobrine.angelring.AngelRing;
import dev.denismasterherobrine.angelring.fabric.item.AngelRingItem;
import dev.denismasterherobrine.angelring.fabric.item.DiamondRingItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AngelRingRegistryFabric {
    public static void registerItems() {
        Registry.register(Registries.ITEM, Identifier.of(AngelRing.MOD_ID, "angel_ring"), new AngelRingItem());
        Registry.register(Registries.ITEM, Identifier.of(AngelRing.MOD_ID, "diamond_ring"), new DiamondRingItem());
    }

    public static void register() {
        registerItems();
    }
}

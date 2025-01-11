package dev.denismasterherobrine.angelring.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import dev.denismasterherobrine.angelring.AngelRing;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(AngelRing.MOD_ID)
public final class AngelRingNeoForge {
    public AngelRingNeoForge(IEventBus eventBus) {
        eventBus.addListener(AngelRingNeoForge::setup);
//        AngelRingRegistryNeoForge.register(eventBus);
    }

    private static void setup(final FMLCommonSetupEvent event) {
        AngelRing.init();
    }
}

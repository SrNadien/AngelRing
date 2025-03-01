package dev.denismasterherobrine.angelring.neoforge.item;

import dev.denismasterherobrine.angelring.AngelRing;
import dev.denismasterherobrine.flightapi.api.FlightAPI;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Rarity;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.UUID;

public class AngelRingItem extends Item implements ICurioItem {
    public AngelRingItem() {
        super(new Settings()
                .maxCount(1)
                .rarity(Rarity.EPIC)
        );
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        LivingEntity entity = slotContext.entity();
        if (entity.getEntityWorld().isClient) return;
        if (entity instanceof ServerPlayerEntity player) {
            FlightAPI.requestFlight(AngelRing.MOD_ID, player);
        }
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity entity = slotContext.entity();
        if (entity.getEntityWorld().isClient) return;
        UUID playerUUID = entity.getUuid();

        // Check whether the player is the current owner
        FlightAPI.getCurrentOwner(playerUUID).ifPresent(owner -> {
            // TODO: Add the price as XP and/or Energy.
        });
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity entity = slotContext.entity();
        if (entity.getEntityWorld().isClient) return;

        if (entity instanceof ServerPlayerEntity player) {
            FlightAPI.releaseFlight(AngelRing.MOD_ID, player);
        }
    }
}

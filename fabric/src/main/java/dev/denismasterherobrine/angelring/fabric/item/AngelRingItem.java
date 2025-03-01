package dev.denismasterherobrine.angelring.fabric.item;

import dev.denismasterherobrine.angelring.AngelRing;
import dev.denismasterherobrine.flightapi.api.FlightAPI;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Rarity;

import java.util.UUID;

public class AngelRingItem extends TrinketItem {
    public AngelRingItem() {
        super(new Settings()
                .maxCount(1)
                .rarity(Rarity.EPIC)
        );
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getEntityWorld().isClient) return;

        if (entity instanceof ServerPlayerEntity player) {
            FlightAPI.requestFlight(AngelRing.MOD_ID, player);
        }
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getEntityWorld().isClient) return;
        UUID playerUUID = entity.getUuid();

        FlightAPI.getCurrentOwner(playerUUID).ifPresent(owner -> {
            // Pay the price
            if (entity instanceof ServerPlayerEntity player) {
                if (player.experienceLevel > 0) {
                    player.addExperience(-1);
                }
            }
        });
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        // Make sure that code runs only once
        if (entity.getEntityWorld().isClient) return;

        // Check whether it is a Player
        if (entity instanceof ServerPlayerEntity player) {
            FlightAPI.releaseFlight(AngelRing.MOD_ID, player);
        }
    }
}

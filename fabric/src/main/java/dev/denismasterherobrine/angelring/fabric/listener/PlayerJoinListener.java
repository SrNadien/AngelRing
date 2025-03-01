package dev.denismasterherobrine.angelring.fabric.listener;

import dev.denismasterherobrine.angelring.AngelRing;
import dev.denismasterherobrine.flightapi.api.FlightAPI;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;

public class PlayerJoinListener {
    public static void onPlayerJoin() {
        ServerPlayConnectionEvents.JOIN.register((ServerPlayNetworkHandler player, PacketSender packetSender, MinecraftServer server) -> {
            if (player.player != null) {
                System.out.println("Player joined: " + FlightAPI.getFlightQueue(player.player.getGameProfile().getId()));
//
//                FlightAPI.getCurrentOwner(player.player.getGameProfile().getId()).ifPresent(owner -> {
//                    FlightAPI.requestFlight(AngelRing.MOD_ID, player.player);
//                });

                FlightAPI.requestFlight(AngelRing.MOD_ID, player.player);

                System.out.println("Player joined 2: " + FlightAPI.getFlightQueue(player.player.getGameProfile().getId()));
            }
        });
    }
}

package com.ilyas.Aeroptimizer;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.Minecraft;

@EventBusSubscriber(modid = Aeroptimizer.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExampleModClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        Aeroptimizer.LOGGER.info("Minecraft username: {}", Minecraft.getInstance().getUser().getName());
    }
}
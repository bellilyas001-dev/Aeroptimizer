package com.ilyas.Aeroptimizer;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;

@Mod(Aeroptimizer.MODID)
public class Aeroptimizer {

    public static final String MODID = "aeroptimizer";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Aeroptimizer(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Aeroptimizer initialized!");
    }
}
package me.kall.tridenchantability;

import me.kall.tridenchantability.config.TridentConfig;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Tridenchantability.MOD_ID)
public final class Tridenchantability {
    public static final String MOD_ID = "tridenchantability";
    public static final Logger LOGGER = LogManager.getLogger(Tridenchantability.class);

    static {
        TridentConfig.init();
    }
}

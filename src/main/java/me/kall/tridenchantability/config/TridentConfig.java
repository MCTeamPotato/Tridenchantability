package me.kall.tridenchantability.config;

import me.kall.jsonate.api.JsonConfig;
import me.kall.tridenchantability.Tridenchantability;

public class TridentConfig {
    private static final String TRIDENT_ENCHANTMENT_VALUE_KEY = "TridentEnchantmentValue";
    private static final String REGARD_TRIDENT_AS_WEAPON_KEY = "RegardTridentAsWeapon";

    public static int TRIDENT_ENCHANTMENT_VALUE;
    public static boolean REGARD_TRIDENT_AS_WEAPON;

    public static void init() {
        JsonConfig config = JsonConfig.create(Tridenchantability.MOD_ID, "1.0.0")
                .put(TRIDENT_ENCHANTMENT_VALUE_KEY, 1)
                .put(REGARD_TRIDENT_AS_WEAPON_KEY, true)
                .initialize();

        TRIDENT_ENCHANTMENT_VALUE = config.getInt(TRIDENT_ENCHANTMENT_VALUE_KEY);
        REGARD_TRIDENT_AS_WEAPON = config.getBoolean(REGARD_TRIDENT_AS_WEAPON_KEY);

        Tridenchantability.LOGGER.warn("Tridenchantability config reloaded successfully.");
        Tridenchantability.LOGGER.info("Current {} value: {}", TRIDENT_ENCHANTMENT_VALUE_KEY, TRIDENT_ENCHANTMENT_VALUE);
        Tridenchantability.LOGGER.info("Current {} value: {}", REGARD_TRIDENT_AS_WEAPON_KEY, REGARD_TRIDENT_AS_WEAPON);
    }
}

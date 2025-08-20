package me.kall.tridenchantability.mixin;

import me.kall.tridenchantability.config.TridentConfig;
import net.minecraft.world.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TridentItem.class)
public class TridentItemMixin {
    @ModifyConstant(method = "getEnchantmentValue", constant = @Constant(intValue = 1))
    private int trident$enchantmentValue(int constant) {
        return TridentConfig.TRIDENT_ENCHANTMENT_VALUE;
    }
}

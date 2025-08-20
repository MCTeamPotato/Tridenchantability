package me.kall.tridenchantability.mixin;

import me.kall.tridenchantability.config.TridentConfig;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.world.item.enchantment.EnchantmentCategory$6")
public abstract class EnchantmentCategoryMixin {
    @Inject(method = "canEnchant", at = @At("HEAD"), cancellable = true)
    private void trident$injectWeaponCanEnchant(Item item, CallbackInfoReturnable<Boolean> cir) {
        if (!TridentConfig.REGARD_TRIDENT_AS_WEAPON) return;
        if (item instanceof TridentItem) cir.setReturnValue(true);
    }
}

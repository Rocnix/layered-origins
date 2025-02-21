package rocnix.layeredorigins.StatusEffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BadEnvironStatusEffect extends StatusEffect {
    public BadEnvironStatusEffect() {
        super(
                StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0xb9C3A0); // color in RGB
    }
}

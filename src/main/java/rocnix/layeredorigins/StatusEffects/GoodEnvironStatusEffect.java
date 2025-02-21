package rocnix.layeredorigins.StatusEffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class GoodEnvironStatusEffect extends StatusEffect {
    public GoodEnvironStatusEffect() {
        super(
                StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0x328c28); // color in RGB
    }
}

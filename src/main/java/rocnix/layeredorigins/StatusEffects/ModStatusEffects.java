package rocnix.layeredorigins.StatusEffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rocnix.layeredorigins.LayeredOrigins;

public class ModStatusEffects {
    public static final StatusEffect GOOD_ENVIRONMENT = registerEffect("good_environment", new GoodEnvironStatusEffect());

    private static StatusEffect registerEffect(String name, StatusEffect effect) {
      return Registry.register(Registries.STATUS_EFFECT, new Identifier(LayeredOrigins.MOD_ID, name), effect);
    };

    public static void RegisterModStatusEffects() {
        LayeredOrigins.LOGGER.info("Registering Status Effects for " + LayeredOrigins.MOD_ID);
    }
}

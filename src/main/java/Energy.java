import net.minecraft.util.Identifier;

/**
 * Defines energy type.
 *
 * Use to define your energy system.
 * Feel free to use multiple times for things like voltages.
 */
public interface Energy {

    /**
     * Name of energy system/type.
     * eg. modid:energy_lv
     *
     * @return energy Identifier
     */
    public Identifier getEnergySystem();

    /**
     * Conversion factor method.
     * Use to configure how your energy is converted to another type of energy.
     *
     * @param energy Energy type that you want to convert from/to
     * @return conversion factor
     */
    default float getEnergyConversion(Energy energy) {
        return 0;
    }

}

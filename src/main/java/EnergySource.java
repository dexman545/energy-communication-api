/**
 * A provider of energy
 */
public interface EnergySource {

    /**
     * Remove energy from this source.
     *
     * @param energy energy type queried.
     * @param drainAmount amount of energy to remove from this.
     * @return true if drain was successful, false otherwise.
     */
    public boolean drainEnergy(Energy energy, int drainAmount);

    /**
     * Maximum energy output.
     *
     * @param energy energy type queried.
     * @return maximum amount of energy this source can provide each cycle.
     */
    public int getMaxEnergyOutput(Energy energy);

}

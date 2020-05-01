/**
 * Something that takes in energy.
 */
public interface EnergySink {

    /**
     * Give energy to this sink.
     *
     * @param energy energy type provided
     * @param inputAmount amount of provided energy
     * @return true if the energy was accepted, false otherwise
     */
    public boolean provideEnergy(Energy energy, int inputAmount);

    /**
     * Maximum energy intake each cycle.
     *
     * @param energy energy type queried.
     * @return maximum amount of energy possible to receive each cycle
     */
    public int getMaxEnergyIntake(Energy energy);

    /**
     * Energy this sink currently desires.
     * eg. the remaining amount of energy needed to fill a battery.
     *
     * @param energy energy type queried.
     * @return amount of energy this desires this cycle.
     */
    public int getCurrentDesiredEnergy(Energy energy);

}

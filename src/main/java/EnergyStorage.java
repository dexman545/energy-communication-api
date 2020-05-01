/**
 * A collector of energy.
 * eg. a battery.
 */
public interface EnergyStorage extends EnergySource, EnergySink {

    /**
     * Maximum amount of energy this storage can hold.
     *
     * @param energy energy type queried
     * @return maximum capacity
     */
    public int getMaxCapacity(Energy energy);

    /**
     * Current amount of energy this storage has.
     *
     * @param energy energy type queried.
     * @return the current amount of energy stored
     */
    public int getCurrentCapacity(Energy energy);

}

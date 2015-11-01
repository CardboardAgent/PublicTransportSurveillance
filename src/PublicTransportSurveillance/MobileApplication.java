package PublicTransportSurveillance;

import java.util.ArrayList;

/**
 * Class MobileApplication which acts as an observer
 * in the observer pattern
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public class MobileApplication implements TravelInformation {

    private ArrayList<Bus> delayedBus = new ArrayList<Bus>();

    /**
     * update the delays
     *
     * @param delayedBus The new delays
     */
    @Override
    public void updateDelays(ArrayList<Bus> delayedBus) {
        this.delayedBus = delayedBus;
    }

    /**
     * Get the delays for the bus
     *
     * @return ArrayList<Bus> The delayed Buses
     */
    public ArrayList<Bus> getDelayedBus()
    {
        return this.delayedBus;
    }
}

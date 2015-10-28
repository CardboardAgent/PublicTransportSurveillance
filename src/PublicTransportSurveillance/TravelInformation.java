package PublicTransportSurveillance;

import java.util.ArrayList;

/**
 * Interface TravelInformation which acts
 * as the observer-interface inn the observer pattern
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public interface TravelInformation {
    /**
     * update the delays
     *
     * @param delayedBus The new delays
     */
    public void updateDelays(ArrayList<Bus> delayedBus);
}

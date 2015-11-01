package PublicTransportSurveillance;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Class BusStation which acts as an observer
 * in the observer pattern
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public class BusStation implements Observer {

    private Object delayedBus = new ArrayList<Bus>();

    /**
     * update the delays
     *
     * @param delayedBus The new delays
     */
    @Override
	public void update(Observable arg0, Object delayedBus) {
        this.delayedBus = delayedBus;
    }

    /**
     * Get the delays for the bus
     *
     * @return ArrayList<Bus> The delayed Buses
     */
    public Object getDelayedBus()
    {
        return this.delayedBus;
    }
}

package PublicTransportSurveillance;

import java.util.ArrayList;

/**
 * Abstract class PublicTransportSurveillance
 * which acts as a subject in the observer pattern
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class PublicTransportSurveillance {
    protected ArrayList<TravelInformation> subscribers = new ArrayList<TravelInformation>();
    protected ArrayList<Bus> delayedBus = new ArrayList<Bus>();

    /**
     * Add a subscriber to the array list
     *
     * @param subscriber the subscriber to add
     */
    public void addSubscriber(TravelInformation subscriber)
    {
        this.subscribers.add(subscriber);
    }

    /**
     * Remove a subscriber from the list
     *
     * @param subscriber the subscriber to remove
     */
    public void removeSubscriber(TravelInformation subscriber)
    {
        this.subscribers.remove(subscriber);
    }

    /**
     * Push the new delays to the subscribers
     *
     * @param delayedBus the new delays
     */
    private void updateDelays(ArrayList<Bus> delayedBus)
    {
        for (TravelInformation subscriber : subscribers) {
            subscriber.updateDelays(delayedBus);
        }
    }

    /**
     * Set the new delayed bus and update the subscribers
     *
     * @param delayedBus The new delayed buses
     */
    public void setDelay(ArrayList<Bus> delayedBus)
    {
        this.delayedBus = delayedBus;
        this.updateDelays(delayedBus);
    }
}

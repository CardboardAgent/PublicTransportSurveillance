package PublicTransportSurveillance;

import java.util.ArrayList;

/**
 * Class Bus which acts as a specific subject
 * in the observer pattern
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public class Bus extends PublicTransportSurveillance {
    private int number;
    private float delay = 0.0f;

    /**
     * The constructor of the bus
     *
     * @param number The number of the bus
     */
    public Bus(int number)
    {
        this.number = number;
    }

    /**
     * Set a delay for the bus
     *
     * @param delay The new delay
     */
    public void setDelay(float delay)
    {
        this.delay = delay;
        ArrayList<Bus> delayed = new ArrayList<Bus>();
        delayed.add(this);
        this.setDelay(delayed);
    }

    /**
     * Get the number of the bus
     *
     * @return int Number of the bus
     */
    public int getNumber()
    {
        return this.number;
    }

    /**
     * Get the delay of the bus
     * @return float Delay of the bus
     */
    public float getDelay()
    {
        return this.delay;
    }
}

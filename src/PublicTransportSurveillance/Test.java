package PublicTransportSurveillance;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Example of the PublicTransportSurveillance-System
 *
 * @author Berger Adrian
 * @author Br�nnimann Nick
 * @since 0.0.1
 * @version 0.0.1
 */
public class Test {
    public static void main(String[] args)
    {
        // create observers
        BusStation busStation = new BusStation();
        MobileApplication mobileApplication = new MobileApplication();
        Website website = new Website();

        // create buses
        Bus busOne = new Bus(1);
        Bus busTwo = new Bus(2);

        // add observers
        busOne.addObserver(busStation);
        busOne.addObserver(mobileApplication);
        busOne.addObserver(website);

        busTwo.addObserver(busStation);
        busTwo.addObserver(mobileApplication);

        // get current delays and display them
        printDelay(busStation, busStation.getDelayedBus());
        printDelay(website, website.getDelayedBus());
        printDelay(mobileApplication, mobileApplication.getDelayedBus());

        // cause delay
        busOne.setDelay(60.5f);
        // display delays
        printDelay(mobileApplication, mobileApplication.getDelayedBus());
        // cause an other delay
        busTwo.setDelay(10.6f);
        // display delays
        printDelay(website, website.getDelayedBus());
        printDelay(busStation, busStation.getDelayedBus());
    }

    @SuppressWarnings("unchecked")
	public static void printDelay(Observer observer, Object delayedBuses)
    {
		ArrayList<Bus> buses = (ArrayList<Bus>) delayedBuses;
        if(!buses.isEmpty()) {
        	for (Bus bus : buses) {
                System.out.println(observer.getClass() + " meldet: Bus " + bus.getNumber() + " hat eine Versp�tung von " +
                        bus.getDelay() + " Minuten");
            }
        } else {
            System.out.println(observer.getClass() + " meldet: Bisher keine Versp�tungen vorhanden. Wir w�nschen Ihnen eine gute Fahrt!");
        }
    }
}

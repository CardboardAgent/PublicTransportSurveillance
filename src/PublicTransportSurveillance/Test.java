package PublicTransportSurveillance;

import java.util.ArrayList;

/**
 * Example of the PublicTransportSurveillance-System
 *
 * @author Berger Adrian
 * @author Brönnimann Nick
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
        busOne.addSubscriber(busStation);
        busOne.addSubscriber(mobileApplication);
        busOne.addSubscriber(website);

        busTwo.addSubscriber(busStation);
        busTwo.addSubscriber(mobileApplication);

        // get current delays and display them
        printDelay(busStation, busStation.getDelayedBus());

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

    public static void printDelay(TravelInformation observer, ArrayList<Bus> delayedBuses)
    {
        if(!delayedBuses.isEmpty()) {
            for (Bus bus : delayedBuses) {
                System.out.println(observer.getClass() + " meldet: Bus " + bus.getNumber() + " hat eine Verspätung von " +
                        bus.getDelay() + "Minuten");
            }
        } else {
            System.out.println(observer.getClass() + ": Bisher keine Verspätungen vorhanden. Wir wünschen Ihnen eine gute Fahrt!");
        }
    }
}

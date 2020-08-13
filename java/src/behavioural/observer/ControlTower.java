import java.util.ArrayList;
import java.util.List;

public class ControlTower implements ISubject {

    List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        // Logic to remove an observer here.
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            // We can send the entire subject or the partial state of the object to the
            // observers
            // we can implement it as a push vs pull model depending on the requirement.
            observer.update("New notification and total number of observables registered are " + observers.size());
        }
    }

    /**
     * This is hypothetical function that runs perptually, gathering runway and
     * weather conditions and notifying all observers of them periodically.
     */
    public void run() {
        // perpetual loop to update the observers every 5 minutes.
        while (true) {
            // get new runway and weather conditions and notify observers
            try {
                System.out.println("Sleeping for 30 seconds.");
                Thread.sleep(1000 * 30);
                notifyObservers();
            } catch (InterruptedException e) {
                // handle exception properly, I am just printing the stack trace.
                // Never do it.
                e.printStackTrace();
            }

        }
    }

}
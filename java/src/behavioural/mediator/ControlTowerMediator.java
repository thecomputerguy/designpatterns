import java.util.ArrayList;
import java.util.List;

public class ControlTowerMediator {
    private List<IAircraft> queuedForLanding = new ArrayList<>();

    // An aircraft just notifies the control tower that it wants to land
    // and doesn't coordinate with other aircrafts.
    synchronized public void requestToLand(IAircraft aircraft) {
        queuedForLanding.add(aircraft);
    }

    public void run() {

        System.out.println("Control tower started.");
        // perpetual loop to land queued flights
        while (true) {

            System.out.println("waiting for flight.");
            // inefficient busy wait till aircraft requests to land.
            while (queuedForLanding.size() == 0)
                ;

            IAircraft aircraft;
            synchronized (this) {
                aircraft = queuedForLanding.remove(0);
            }

            // we have only one runway available so only allow a single aircraft to land.
            aircraft.land();
        }
    }

}
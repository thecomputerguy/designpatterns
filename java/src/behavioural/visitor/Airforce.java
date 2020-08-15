import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce {

    List<IAircraft> aircrafts = new ArrayList<>();

    public Airforce() {
        aircrafts.add(new F16());
        aircrafts.add(new Boeing747());
    }

    public Iterator<IAircraft> getIterator() {
        return aircrafts.iterator();
    }
}
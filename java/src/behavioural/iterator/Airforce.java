import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Airforce {
    List<IAircraft> jets = new ArrayList<>();
    IAircraft[] helis = new IAircraft[1];
    LinkedList<Boeing747> boeing747s = new LinkedList<>();

    public Airforce() {
        this.jets.add(new F16());
        this.helis[0] = new CobraGunship();
        this.boeing747s.add(new Boeing747());
    }

    public List<IAircraft> getJets() {
        return this.jets;
    }

    public IAircraft[] getHelis() {
        return this.helis;
    }

    public LinkedList<Boeing747> getBoeing747s() {
        return this.boeing747s;
    }

    public Iterator createJetsIterator() {
        return new JetsIterator(this);
    }

    public Iterator createAirforceIterator() {
        return new AirforceIterator(this);
    }
}
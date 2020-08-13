import java.util.LinkedList;
import java.util.List;

public class AirforceIterator implements Iterator {

    private List<IAircraft> jets;
    private IAircraft[] helis;
    private LinkedList<Boeing747> boeing747s;
    private int jetsIndex = 0;
    private int helisIndex = 0;
    private int boeingsIndex = 0;

    public AirforceIterator(Airforce airforce) {
        this.jets = airforce.getJets();
        this.helis = airforce.getHelis();
        this.boeing747s = airforce.getBoeing747s();
    }

    public IAircraft next() {
        // custom logic for iterating over the elements in all the collections.
        if (helis.length > helisIndex) {
            return this.helis[helisIndex++];
        }

        if (jets.size() > jetsIndex) {
            return this.jets.get(jetsIndex++);
        }

        if (boeing747s.size() > boeingsIndex) {
            return this.boeing747s.get(boeingsIndex++);
        }

        throw new RuntimeException("No more elements to iterate over.");
    }

    public boolean hasNext() {
        return helis.length > helisIndex || jets.size() > jetsIndex || boeing747s.size() > boeingsIndex;
    }
}
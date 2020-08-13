import java.util.List;

public class JetsIterator implements Iterator {

    private List<IAircraft> jets;
    private int jetsIndex = 0;

    public JetsIterator(Airforce airforce) {
        this.jets = airforce.getJets();
    }

    public IAircraft next() {

        if (jets.size() > jetsIndex) {
            return jets.get(jetsIndex++);
        }
        throw new RuntimeException("No more elements to iterate");
    }

    public boolean hasNext() {
        return jets.size() > jetsIndex;
    }

}
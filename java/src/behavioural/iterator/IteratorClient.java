
public class IteratorClient {

    public static void main(String[] args) {
        Airforce airforce = new Airforce();
        Iterator jetsItertor = airforce.createJetsIterator();
        Iterator airforceIterator = airforce.createAirforceIterator();
        // Jets iterator
        while (jetsItertor.hasNext()) {
            jetsItertor.next().fly();
        }
        // Airforce iterator
        while (airforceIterator.hasNext()) {
            airforceIterator.next().fly();
        }
    }
}
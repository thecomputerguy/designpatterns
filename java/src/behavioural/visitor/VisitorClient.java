import java.util.Iterator;

public class VisitorClient {
    public static void main(String[] args) {
        Airforce airforce = new Airforce();
        MetricsVisitor metricsVisitor = new MetricsVisitor();
        Iterator<IAircraft> iterator = airforce.getIterator();
        while (iterator.hasNext()) {
            IAircraft aircraft = iterator.next();
            aircraft.accept(metricsVisitor);
        }

        metricsVisitor.printAccumulatedResult();
    }
}
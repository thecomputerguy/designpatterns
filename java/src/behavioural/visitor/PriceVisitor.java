public class PriceVisitor implements IAircraftVisitor {

    @Override
    public void visitBoeing747(IAircraft aircraft) {
        // logic to get metrics
        // adding a simple print statement.
        System.out.println("Metrics visitor is visiting boeing 747.");
    }

    @Override
    public void visitF16(IAircraft aircraft) {
        // logic to get metrics
        // adding a simple print statement.
        System.out.println("Metrics visitor is visiting F16.");

    }

    public void printAccumulatedResult() {
        System.out.println("Printing Metrics visitor's Accumulated Result");
    }
}
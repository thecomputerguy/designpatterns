public class LuxuryFitting extends BoeingDecorator {

    private IAircraftDecorator aircraft;

    public LuxuryFitting(IAircraftDecorator aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void fly() {
        System.out.println("Flying with luxury fittings.");
    }

    @Override
    public void land() {
        System.out.println("Landing with luxury fittings.");
    }

    @Override
    public float getWeight() {
        return 10.5F + aircraft.getWeight();
    }
}
public class Bulletproof extends BoeingDecorator {

    private IAircraftDecorator aircraft;

    public Bulletproof(IAircraftDecorator aircraft) {
        this.aircraft = aircraft;
    }

    public void fly() {
        System.out.println("Flying with bullet proof capabilities.");
    }

    public void land() {
        System.out.println("Landing with bullet proof capabilities.");
    }

    public float getWeight() {
        return 15.5F + aircraft.getWeight();
    }
}
public class F16Prototype implements AircraftPrototype {

    private F16Engine engine = new F16Engine(); // Default engine.

    public void fly() {
        System.out.println("F16 flying with engine ");
        this.engine.run();
    }

    public void setEngine(F16Engine engine) {
        this.engine = engine;
    }

    @Override
    public AircraftPrototype clone() throws CloneNotSupportedException {
        // Create a deep clone of the object and return
        F16Prototype aircraftPrototype = new F16Prototype();
        F16Engine f16Engine = this.engine.clone();
        aircraftPrototype.setEngine(f16Engine);
        return aircraftPrototype;
    }
}

public class Aircraft {

    IEngine engine;
    ICockpit cockpit;
    IWings wings;
    AbstractFactory factory;

    public Aircraft(AbstractFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        engine = this.factory.createEngine();
        cockpit = this.factory.createCockpit();
        wings = this.factory.createWings();
        return this;
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();
        System.out.println("Flying using ");
        engine.run();
    }

    public void taxi() {
        System.out.println("Taxing on runway");
    }
}
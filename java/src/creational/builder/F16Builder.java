public class F16Builder extends AircraftBuilder {

    private F16 f16;

    @Override
    public void buildCockpit() {
        // first call will be to the cockpit.
        // we should build cockpit first
        // And order of building the f16 will be forced by the director
        f16 = new F16();
        // give f16 a cockpit
        // f16.cockpit = new F16Cockpit();
        System.out.println("Built f16 cockpit");
    }

    @Override
    public void buildEngine() {
        // give F-16 an engine
        // f16.engine = new F16Engine()
        System.out.println("built f16 engine");
    }

    @Override
    public void buildWings() {
        // give wings to F-16
        // f16.wings = new F16Wings()
        System.out.println("built f16 wings");
    }

    @Override
    Aircraft getResult() {
        return f16;
    }

}
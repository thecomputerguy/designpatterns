public class Boeing747Builder extends AircraftBuilder {

    private Boeing747 boeing747;

    @Override
    public void buildBathrooms() {
        // Give bathrooms to boeing747
        // Can be an array or list of Boeing747Bathroom object
        // boeing747.bathrooms = new Boeing747Bathrooms()
        System.out.println("built boeing bathrooms");
    }

    @Override
    public void buildCockpit() {
        boeing747 = new Boeing747();
        // give boeing747 a cockpit
        // boeing747.cockpit = new Boeing747Cockpit();
        System.out.println("built boeing cockpit");
    }

    @Override
    public void buildEngine() {
        // Give boeing747 an engine
        // boeing747.engine = new Boeing747Engine();
        System.out.println("built boeing engine");
    }

    @Override
    public void buildWings() {
        // Give wings to boeing747
        // boeing747.wings = new Boeing747Wings();
        System.out.println("built boeing wings");
    }

    @Override
    Aircraft getResult() {
        return boeing747;
    }

}
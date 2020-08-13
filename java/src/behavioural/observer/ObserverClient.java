public class ObserverClient {

    public static void main(String[] args) {
        // we add an entity change manager between observer and subject to ensure to
        // loose coupling between
        // the two and also to save the observers from getting overwhelmed with frequent
        // updates.
        // but for now keeping it simple with direct communication between observers and
        // subject.
        ControlTower controlTower = new ControlTower();
        IAircraft f16 = new F16Observer(controlTower);
        f16.fly();
        controlTower.run();
    }
}
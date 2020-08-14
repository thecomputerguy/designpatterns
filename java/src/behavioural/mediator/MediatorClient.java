public class MediatorClient {

    public static void main(String[] args) {
        ControlTowerMediator controlTower = new ControlTowerMediator();
        F16Aircraft f16Aircraft = new F16Aircraft(controlTower);
        f16Aircraft.requestControlTowerToLand();
        controlTower.run();
    }
}
public class F16Aircraft implements IAircraft {

    private ControlTowerMediator controlTower;

    public F16Aircraft(ControlTowerMediator controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void fly() {
        System.out.println("F16 is flying.");
    }

    @Override
    public void land() {
        System.out.println("F16 is landing.");
    }

    public void requestControlTowerToLand() {
        this.controlTower.requestToLand(this);
    }

}
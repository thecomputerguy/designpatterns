public class AirforceOneWithBillPughSingleton {

    private static class AirforceOneWithBillPughSingletonHolder {
        private static AirforceOneWithBillPughSingleton airforceOne = new AirforceOneWithBillPughSingleton();
    }

    public void fly() {
        System.out.println("Bug puh's Airforce one is flying.");
    }

    public static AirforceOneWithBillPughSingleton getInstance() {
        return AirforceOneWithBillPughSingletonHolder.airforceOne;
    }
}
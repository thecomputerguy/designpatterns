public class AirforceOneWithBugPuhsSingleton {

    private static AirforceOneWithBugPuhsSingleton airforceOne;

    static {
        airforceOne = new AirforceOneWithBugPuhsSingleton();
    }

    public void fly() {
        System.out.println("Bug puh's Airforce one is flying.");
    }

    public static AirforceOneWithBugPuhsSingleton getInstance() {
        return airforceOne;
    }
}
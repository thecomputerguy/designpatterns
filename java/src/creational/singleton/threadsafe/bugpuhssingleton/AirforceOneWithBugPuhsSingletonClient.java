public class AirforceOneWithBugPuhsSingletonClient {

    public static void main(String[] args) {
        AirforceOneWithBugPuhsSingleton airforceOne = AirforceOneWithBugPuhsSingleton.getInstance();
        airforceOne.fly();
    }
}
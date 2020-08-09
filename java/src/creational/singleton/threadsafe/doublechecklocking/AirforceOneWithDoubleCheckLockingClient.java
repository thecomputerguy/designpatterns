public class AirforceOneWithDoubleCheckLockingClient {

    public static void main(String[] args) {

        AirforceOneWithDoubleCheckLocking airforceOne = AirforceOneWithDoubleCheckLocking.getInstance();
        airforceOne.fly();
    }
}
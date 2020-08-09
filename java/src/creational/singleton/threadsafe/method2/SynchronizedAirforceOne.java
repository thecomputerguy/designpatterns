public class SynchronizedAirforceOne {

    private static SynchronizedAirforceOne airforceOne;

    private SynchronizedAirforceOne() {

    }

    public void fly() {
        System.out.println("Synchronized airforce one flying.");
    }

    public static synchronized SynchronizedAirforceOne getInstance() {

        if (airforceOne == null) {
            airforceOne = new SynchronizedAirforceOne();
        }

        return airforceOne;
    }

}
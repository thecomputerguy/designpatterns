public class AirforceOneWithDoubleCheckLocking {

    private static volatile AirforceOneWithDoubleCheckLocking airforceOne;

    private AirforceOneWithDoubleCheckLocking() {

    }

    public void fly() {
        System.out.println("Airforce one With Double Check locking is flying.");
    }

    public static synchronized AirforceOneWithDoubleCheckLocking getInstance() {

        if (airforceOne == null) {

            synchronized (AirforceOneWithDoubleCheckLocking.class) {

                if (airforceOne == null) {
                    airforceOne = new AirforceOneWithDoubleCheckLocking();
                }
            }
        }

        return airforceOne;
    }
}
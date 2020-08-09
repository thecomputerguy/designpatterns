public class AirforceOneStaticInitialization {

    // Eager initialization, but thread safe
    private static AirforceOneStaticInitialization airforceOne = new AirforceOneStaticInitialization();

    private AirforceOneStaticInitialization() {

    }

    public void fly() {
        System.out.println("statically initialized Airforce one flying");
    }

    public static AirforceOneStaticInitialization getInstance() {
        return airforceOne;
    }
}
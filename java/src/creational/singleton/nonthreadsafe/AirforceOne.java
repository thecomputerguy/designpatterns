public class AirforceOne {

    private static AirforceOne airforceOne;

    private AirforceOne() {

    }

    public void fly() {
        System.out.println("Airforce one is flying");
    }

    public static AirforceOne getInstance() {

        if (airforceOne == null) {

            airforceOne = new AirforceOne();
        }

        return airforceOne;
    }

}
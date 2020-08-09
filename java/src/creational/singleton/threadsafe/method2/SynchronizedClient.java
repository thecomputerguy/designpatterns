public class SynchronizedClient {

    public static void main(String[] args) {
        SynchronizedAirforceOne airforceOne = SynchronizedAirforceOne.getInstance();
        airforceOne.fly();
    }
}
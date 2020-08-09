public class SingletonClient {

    public static void main(String[] args) {

        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();

    }
}
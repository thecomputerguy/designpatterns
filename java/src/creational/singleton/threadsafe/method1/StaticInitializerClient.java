public class StaticInitializerClient {

    public static void main(String[] args) {
        AirforceOneStaticInitialization airforceOne = AirforceOneStaticInitialization.getInstance();
        airforceOne.fly();
    }
}
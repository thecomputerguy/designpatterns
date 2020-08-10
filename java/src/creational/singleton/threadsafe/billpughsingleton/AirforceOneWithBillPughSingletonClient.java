public class AirforceOneWithBillPughSingletonClient {

    public static void main(String[] args) {
        AirforceOneWithBillPughSingleton airforceOne = AirforceOneWithBillPughSingleton.getInstance();
        airforceOne.fly();
    }
}
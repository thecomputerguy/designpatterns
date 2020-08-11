public class AdapterClient {
    public static void main(String[] args) {
        HotAirBalloon hotAirBallon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBallon);
        hotAirBalloonAdapter.fly();
    }
}
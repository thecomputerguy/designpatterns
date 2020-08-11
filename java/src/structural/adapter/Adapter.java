public class Adapter implements IAircraft {

    private HotAirBalloon hotAirBallon;

    public Adapter(HotAirBalloon hotAirBallon) {
        this.hotAirBallon = hotAirBallon;
    }

    public void fly() {
        String fuelUsed = this.hotAirBallon.inflateWithGas();
        hotAirBallon.fly(fuelUsed);
    }
}
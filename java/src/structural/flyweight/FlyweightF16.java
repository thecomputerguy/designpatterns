public class FlyweightF16 implements IAircraft {
    // intrinsic state
    private final String name = "f16";
    private final int personnel = 2;
    private final String dimensions = "15m long 3m wide";
    private final String wingSpan = "33 feet";

    // Extrinsic state includes current position and current speed
    // which is used to calculate remaining time to destination.
    public double getTimeToDestination(int currX, int currY, int destX, int destY, int currentSpeed) {
        // Algorith to calculate time to destination.

        return 1;
    }

    @Override
    public void fly() {
        System.out.println("F16 flying");
    }

}
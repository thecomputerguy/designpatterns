public class Drone implements IDrone {

    @Override
    public void turnLeft() {
        // Receive an action from proxy and other parameters
        // turn left
        System.out.println("Turning left.");
    }

    @Override
    public void turnRight() {
        // Receive an action from proxy and other parameters
        // turn right
        System.out.println("Turning right.");
    }

    @Override
    public void fireMissile() {
        // Receive an action from proxy and other parameters
        // fire missile
        System.out.println("Firing missile.");
    }
}
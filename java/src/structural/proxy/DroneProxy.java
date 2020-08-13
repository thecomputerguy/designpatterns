public class DroneProxy implements IDrone {

    Drone drone;

    public DroneProxy(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void turnLeft() {
        // Receive an action from client and
        // forward it to the subject.
        // do other hourse keeping stuff before forwarding the request.
        this.drone.turnLeft();
    }

    @Override
    public void turnRight() {
        // Receive an action from client and
        // forward it to the subject.
        // do other house keeping stuff before forwarding the request.
        this.drone.turnRight();
    }

    @Override
    public void fireMissile() {
        // Receive an action from client and
        // forward it to the subject.
        // do other house keeping stuff before forwarding the request.
        this.drone.fireMissile();
    }
}
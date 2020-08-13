import java.util.Scanner;

public class ProxyClient {

    public static void main(String[] args) {
        // Keeping it simple creating subject and proxy in the client code only.
        // proxy should be passed to client with subject's dependency injected in the
        // proxy.
        DroneProxy droneProxy = new DroneProxy(new Drone());

        try (Scanner scanner = new Scanner(System.in)) {
            // Perpetual loop to perform actions.
            while (true) {
                System.out.println("Please provide an action to perform");
                String input = scanner.nextLine();
                switch (input) {
                    case "turnLeft":
                        droneProxy.turnLeft();
                        break;
                    case "turnRight":
                        droneProxy.turnRight();
                        break;
                    case "fireMissile":
                        droneProxy.fireMissile();
                        break;

                    default:
                        System.out.println("Invalid action.");
                        break;
                }
            }
        }

    }
}
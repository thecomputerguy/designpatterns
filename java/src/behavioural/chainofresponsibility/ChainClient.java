public class ChainClient {

    public static void main(String[] args) {
        // create a fire request.
        FireDetectedRequest fireDetectedRequest = new FireDetectedRequest();
        FireHandler fireHandler = new FireHandler(null);
        LowFuelHandler lowFuelHandler = new LowFuelHandler(fireHandler);
        lowFuelHandler.handleRequest(fireDetectedRequest);
    }
}
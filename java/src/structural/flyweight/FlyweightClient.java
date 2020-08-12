public class FlyweightClient {

    public static void main(String[] args) {
        // Extrinsic state kept in a 2 Dimensional array
        int[][] coords = new int[][] { { 30, 40 }, { 50, 60 }, { 70, 80 } };
        double[] timeToDestination = new double[coords.length];
        FlyweightF16 f16 = new FlyweightF16();
        for (int i = 0; i < coords.length; i++) {
            timeToDestination[i] = f16.getTimeToDestination(coords[i][0], coords[i][1], 100, 100, 100);
            System.out.println("F16 " + i + " time to destination: " + timeToDestination[i]);
        }
    }
}
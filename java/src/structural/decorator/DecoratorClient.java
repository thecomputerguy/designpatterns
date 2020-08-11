public class DecoratorClient {

    public static void main(String[] args) {
        IAircraftDecorator baseModel = new Boeing747Model();
        // Add new behaviour at runtime.
        IAircraftDecorator luxuryFitting = new LuxuryFitting(baseModel);
        IAircraftDecorator bulletProof = new Bulletproof(luxuryFitting);
        System.out.println("Total weight after adding luxury fittings and bullet proof capabilities.");
        System.out.println(bulletProof.getWeight());
    }
}
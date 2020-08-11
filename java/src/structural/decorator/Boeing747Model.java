public class Boeing747Model implements IAircraftDecorator {

    @Override
    public void fly() {
        System.out.println("Boeing747 is flying.");
    }

    @Override
    public void land() {
        System.out.println("Boeing747 is landing.");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
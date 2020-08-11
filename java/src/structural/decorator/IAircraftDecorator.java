public interface IAircraftDecorator {

    float baseWeight = 100.0F;

    void fly();

    void land();

    float getWeight();
}
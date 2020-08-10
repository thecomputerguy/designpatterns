public interface AircraftPrototype extends Cloneable {

    void fly();

    AircraftPrototype clone() throws CloneNotSupportedException;

    void setEngine(F16Engine engine);

}
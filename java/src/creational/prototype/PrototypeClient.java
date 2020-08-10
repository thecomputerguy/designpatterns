public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        AircraftPrototype aircraftPrototype = new F16Prototype();
        aircraftPrototype.fly();

        F16AEngine f16AEngine = new F16AEngine();
        AircraftPrototype f16A = aircraftPrototype.clone();
        f16A.setEngine(f16AEngine);
        f16A.fly();
    }
}
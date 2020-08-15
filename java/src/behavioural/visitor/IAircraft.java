public interface IAircraft {

    void fly();

    void accept(IAircraftVisitor visitor);
}
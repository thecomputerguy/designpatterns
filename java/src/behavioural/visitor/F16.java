public class F16 implements IAircraft {

    public void fly() {
        System.out.println("F16 is flying.");
    }

    public void accept(IAircraftVisitor visitor) {
        visitor.visitF16(this);
    }
}
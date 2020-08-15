public class Boeing747 implements IAircraft {

    @Override
    public void fly() {
        System.out.println("Boeing747 is flying.");
    }

    @Override
    public void accept(IAircraftVisitor visitor) {
        visitor.visitBoeing747(this);
    }
}
package factorymethod;

public class F16 {

    Engine engine;
    Cockpit cockpit;

    protected F16 makeF16() {
        this.engine = new F16Engine();
        this.cockpit = new F16Cockpit();
        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing");
    }

    public void fly() {
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 is in the air!");
    }
}
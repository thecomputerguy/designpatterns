
public class F16Factory implements AbstractFactory {

    public IEngine createEngine() {
        return new F16Engine();
    }

    public ICockpit createCockpit() {
        return new F16Cockpit();
    }

    public IWings createWings() {
        return new F16Wings();
    }
}
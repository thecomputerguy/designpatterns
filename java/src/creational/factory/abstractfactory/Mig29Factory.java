public class Mig29Factory implements AbstractFactory {

    @Override
    public ICockpit createCockpit() {
        return new Mig29Cockpit();
    }

    @Override
    public IEngine createEngine() {
        return new Mig29Engine();
    }

    @Override
    public IWings createWings() {
        return new Mig29Wings();
    }

}
public class Boeing747Factory implements AbstractFactory {

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }

}
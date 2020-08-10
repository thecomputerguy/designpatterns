
public interface AbstractFactory {
    IEngine createEngine();

    ICockpit createCockpit();

    IWings createWings();
}
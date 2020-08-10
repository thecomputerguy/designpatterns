
public class AbstractFactoryClient {

    public static void main(String[] args) {

        // create f16 factory which creates parts of f16 fighter jet
        AbstractFactory f16Factory = new F16Factory();
        Aircraft f16 = new Aircraft(f16Factory);
        f16.fly();

        // create boeing747 factory which creates parts of boeing747
        // passenger plane
        AbstractFactory boeing747Factory = new Boeing747Factory();
        Aircraft boeing747 = new Aircraft(boeing747Factory);
        boeing747.fly();

        // create mig29 factory which creates parts of mig29
        AbstractFactory mig29faFactory = new Mig29Factory();
        Aircraft mig29 = new Aircraft(mig29faFactory);
        mig29.fly();
    }
}
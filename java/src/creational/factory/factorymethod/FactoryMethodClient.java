import java.util.ArrayList;
import java.util.Collection;
import factorymethod.F16;
import factorymethod.F16A;
import factorymethod.F16B;

public class FactoryMethodClient {

    public static void main(String[] args) {
        Collection<F16> collection = new ArrayList<>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        collection.add(f16A);
        collection.add(f16B);

        for (F16 f16 : collection) {
            f16.fly();
        }
    }
}
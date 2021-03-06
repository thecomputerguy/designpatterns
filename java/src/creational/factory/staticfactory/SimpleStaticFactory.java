import product.F16A;
import product.F16B;
import product.Aircraft;
import product.F16A;
import product.F16B;
import product.F16;

public class SimpleStaticFactory {

    public static Aircraft makeF16(String variant) {
        switch (variant) {
            case "A":
                return new F16A();
            case "B":
                return new F16B();
            default:
                return new F16();
        }
    }
}
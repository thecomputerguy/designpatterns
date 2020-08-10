import product.Aircraft;

public class SimpleStaticFactoryClient {

    public static void main(String[] args) {
        Aircraft f16A = SimpleStaticFactory.makeF16("A");
        f16A.fly();

        Aircraft f16B = SimpleStaticFactory.makeF16("B");
        f16B.fly();

        Aircraft f16 = SimpleStaticFactory.makeF16("C");
        f16.fly();
    }
}
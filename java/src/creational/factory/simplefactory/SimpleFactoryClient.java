import product.Aircraft;

public class SimpleFactoryClient {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Aircraft f16A = simpleFactory.makeF16("A");
        f16A.fly();
        Aircraft f16B = simpleFactory.makeF16("B");
        f16B.fly();
        Aircraft f16 = simpleFactory.makeF16("C");
        f16.fly();
    }
}
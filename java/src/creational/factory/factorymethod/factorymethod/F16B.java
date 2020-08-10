package factorymethod;

import factorymethod.F16;
import factorymethod.F16BEngine;

public class F16B extends F16 {

    @Override
    public F16 makeF16() {
        F16 f16 = super.makeF16();
        f16.engine = new F16BEngine();
        return this;
    }
}
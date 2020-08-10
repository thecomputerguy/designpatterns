package factorymethod;

import factorymethod.F16AEngine;

public class F16A extends F16 {

    @Override
    public F16 makeF16() {
        F16 f16 = super.makeF16();
        f16.engine = new F16AEngine();
        return this;
    }
}
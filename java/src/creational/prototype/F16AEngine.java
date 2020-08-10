public class F16AEngine extends F16Engine {

    @Override
    public void run() {
        System.out.println(" F16AEngine");
    }

    @Override
    protected F16AEngine clone() throws CloneNotSupportedException {
        F16AEngine f16AEngine = (F16AEngine) super.clone();
        return f16AEngine;
    }

}
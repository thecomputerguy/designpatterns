public class F16Engine implements Engine {

    @Override
    public void run() {
        System.out.println("F16Engine running");
    }

    @Override
    protected F16Engine clone() throws CloneNotSupportedException {
        F16Engine f16Engine = (F16Engine) super.clone();
        return f16Engine;
    }
}
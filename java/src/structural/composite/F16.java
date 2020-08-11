public class F16 implements IAircraft, IAlliancePart {

    public int getPersonnel() {
        return 2;
    }

    @Override
    public void fly() {
        System.out.println("F16 flying");
    }

}
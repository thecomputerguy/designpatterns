public class C130Hercules implements IAircraft, IAlliancePart {

    @Override
    public int getPersonnel() {
        return 5;
    }

    @Override
    public void fly() {
        System.out.println("C130Flying");
    }
}
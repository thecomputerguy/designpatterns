public class F16PreflightCheckList extends AbstractPreflightCheckList {

    @Override
    protected boolean doorsLocked() {
        // F16 unlike a boeing747 has no doors, so always return true
        return true;
    }

    @Override
    public void checkAirPressure() {
        // implement custom logic for checking air pressure
        System.out.println("Air pressure normal");
    }
}
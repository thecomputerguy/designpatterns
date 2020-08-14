public abstract class AbstractPreflightCheckList {

    public final void runCheckList() {

        // check fuel
        isFuelEnough();

        // check doors are locked.
        System.out.println("Doors locked : " + doorsLocked());

        // check air pressure
        checkAirPressure();
    }

    // Don't let subclass override this method, this is a mandatory check.
    protected final void isFuelEnough() {
        System.out.println("Check fuel gauge.");
    }

    // some Airplanes may or may not have doors, so allow this method
    // to be overridden
    protected boolean doorsLocked() {
        return true;
    }

    // Force subclasses to provide their own way of checking cabin or cockpit air
    // pressure
    abstract void checkAirPressure();

}
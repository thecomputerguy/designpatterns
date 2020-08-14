public class AirborneState implements IPilotActions {

    F16 f16;

    public AirborneState(F16 f16) {
        this.f16 = f16;
    }

    public void pilotTaxies(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    public void pilotFlies(F16 f16) {
        System.out.println("This is an invalid operation for this state.");
    }

    public void pilotEjects(F16 f16) {
        // we can change the state to ejectState or crashState
        System.out.println("Transitioning to crash state");
        this.f16.setState(f16.getCrashState());
    }

    public void pilotLands(F16 f16) {
        this.f16.setState(f16.getLandState());
    }

    public void pilotParks(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }
}
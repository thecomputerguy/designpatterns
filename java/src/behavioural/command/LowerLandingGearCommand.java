public class LowerLandingGearCommand implements ICommand {

    private LandingGear landingGear;

    public LowerLandingGearCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        this.landingGear.lowerLandingGear();
    }
}
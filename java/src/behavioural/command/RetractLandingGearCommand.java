public class RetractLandingGearCommand implements ICommand {
    // Receiver of the command.
    private LandingGear landingGear;

    public RetractLandingGearCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        this.landingGear.retractLandingGear();
    }
}
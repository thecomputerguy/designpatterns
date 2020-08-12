public class AutopilotFacade {

    BoeingAltitudeMonitor boeingAltitudeMonitor;
    BoeingEngineController boeingEngineController;
    BoeingFuelMonitor boeingFuelMontitor;
    BoeingNavigationSystem boeingNavigationSytem;

    public AutopilotFacade(BoeingAltitudeMonitor boeingAltitudeMonitor, BoeingEngineController boeingEngineController,
            BoeingFuelMonitor boeingFuelMontitor, BoeingNavigationSystem boeingNavigationSystem) {
        this.boeingAltitudeMonitor = boeingAltitudeMonitor;
        this.boeingEngineController = boeingEngineController;
        this.boeingFuelMontitor = boeingFuelMontitor;
        this.boeingNavigationSytem = boeingNavigationSystem;
    }

    public void autopilotOn() {
        System.out.println("Turning autopilot on.");
        boeingAltitudeMonitor.autoMonitor();
        boeingEngineController.setEngineSpeed(700);
        boeingNavigationSytem.setDirectionBasedOnSpeedAndFuel(boeingEngineController.getEngineSpeed(),
                boeingFuelMontitor.getRemainingFuelInGallons());
    }

    public void autopilotOff() {
        System.out.println("Turning autopilot off.");
        boeingAltitudeMonitor.turnOff();
        boeingEngineController.turnOff();
        boeingFuelMontitor.turnOff();
        boeingNavigationSytem.turnOff();
    }
}
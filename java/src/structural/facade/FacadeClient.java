public class FacadeClient {

    public static void main(String[] args) {
        BoeingAltitudeMonitor altitudeMonitor = new BoeingAltitudeMonitor();
        BoeingEngineController engineController = new BoeingEngineController();
        BoeingFuelMonitor fuelMonitor = new BoeingFuelMonitor();
        BoeingNavigationSystem navigationSystem = new BoeingNavigationSystem();
        AutopilotFacade autopilotFacade = new AutopilotFacade(altitudeMonitor, engineController, fuelMonitor,
                navigationSystem);
        autopilotFacade.autopilotOn();
        autopilotFacade.autopilotOff();
    }
}
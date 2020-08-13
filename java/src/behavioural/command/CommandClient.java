public class CommandClient {

    public static void main(String[] args) {
        LandingGear receiver = new LandingGear();
        ICommand command1 = new LowerLandingGearCommand(receiver);
        ICommand command2 = new RetractLandingGearCommand(receiver);
        InstrumentPanel invoker = new InstrumentPanel();
        invoker.setCommand(0, command1);
        invoker.setCommand(1, command2);
        // Issuing commands
        invoker.lowerLandingGear();
        invoker.retractLandingGear();
    }
}
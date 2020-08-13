
public class InstrumentPanel {

    // Keeping the size 2 for now, we can use dynamic datastructure like list.
    ICommand[] commands = new ICommand[2];

    public void setCommand(int index, ICommand command) {
        commands[index] = command;
    }

    public void lowerLandingGear() {
        // Assuming that client sets lowerLandingGear command at index 0.
        commands[0].execute();
    }

    public void retractLandingGear() {
        // Assuming that client has set retractLandingGear command at index 1.
        commands[1].execute();
    }

}
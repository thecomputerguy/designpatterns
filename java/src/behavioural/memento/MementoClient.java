import java.io.IOException;

public class MementoClient {

    public static void main(String[] args) throws Exception {
        BlackBox blackBox = new BlackBox(773, 800, 95.5F);
        // Save the state of the memento as a byte stream.
        byte[] memento = blackBox.getState();
        System.out.println("Saved state.");

        // Do some work.
        System.out.println("Doing some work.");
        // Now restore the blackBox to the previous state.
        blackBox = blackBox.setState(memento);
        System.out.println("state restored back to previous state");
    }
}
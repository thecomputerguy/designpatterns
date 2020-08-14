import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BlackBox implements Serializable {
    private long altitude;
    private double speed;
    private float engineTemprature;
    private static final long serialVersionUID = 1L;

    public BlackBox(long altitude, double speed, float engineTemprature) {
        this.altitude = altitude;
        this.speed = speed;
        this.engineTemprature = engineTemprature;
    }

    public byte[] getState() throws IOException {
        System.out.println("Getting memento.");
        ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
        ObjectOutput out = null;
        byte[] memento = null;
        try {
            out = new ObjectOutputStream(byteArrayStream);
            out.writeObject(this);
            out.flush();
            memento = byteArrayStream.toByteArray();
        } finally {
            try {
                // try to close the byte array output stream.
                byteArrayStream.close();
            } catch (IOException e) {
                // handle exception properly here...
            }
        }
        return memento;
    }

    public BlackBox setState(byte[] state) throws Exception {
        System.out.println("Setting state");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(state);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        BlackBox blackBox = (BlackBox) objectInputStream.readObject();
        objectInputStream.close();
        return blackBox;
    }
}
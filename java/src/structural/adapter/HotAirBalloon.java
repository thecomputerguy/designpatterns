public class HotAirBalloon {
    private String gasUsed = "Helium";

    public void fly(String gas) {
        System.out.println("Hot air balloon is flying using " + gasUsed);
    }

    public String inflateWithGas() {
        return gasUsed;
    }
}
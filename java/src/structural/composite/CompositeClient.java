public class CompositeClient {

    public static void main(String[] args) {
        Airforce natoAirforce = new Airforce();
        // Simple implementations of these methods for brevity sake.
        natoAirforce.add(createCanadianAirforce());
        natoAirforce.add(createUSAirforce());
        F16 frenchF16 = new F16();
        C130Hercules germanHercules = new C130Hercules();
        natoAirforce.add(frenchF16);
        natoAirforce.add(germanHercules);
        System.out.println("Total personnel in natoAirforce:  ");
        System.out.println(natoAirforce.getPersonnel());

    }

    private static Airforce createCanadianAirforce() {
        Airforce canadianAirforce = new Airforce();
        canadianAirforce.add(new F16());
        return canadianAirforce;
    }

    private static Airforce createUSAirforce() {
        Airforce usAirforce = new Airforce();
        usAirforce.add(new F16());
        usAirforce.add(new C130Hercules());
        return usAirforce;
    }
}
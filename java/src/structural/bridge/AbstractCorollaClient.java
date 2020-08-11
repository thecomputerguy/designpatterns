public class AbstractCorollaClient {

    public static void main(String[] args) {

        AbstractCorollaImpl corollaAsiaPacificImpl = new Corolla_L_Impl_AsiaPacific();
        AbstractCorolla abstractCorolla = new Corolla_L(corollaAsiaPacificImpl);
        abstractCorolla.listSafetyEquipment();
        System.out.println(abstractCorolla.isCarRightHanded());

        // Switch implementation at runtime
        AbstractCorollaImpl corollaNorthAmericaImpl = new Corolla_L_Impl_NorthAmerica();
        abstractCorolla.setAbstractCorollaImpl(corollaNorthAmericaImpl);
        abstractCorolla.listSafetyEquipment();
        System.out.println(abstractCorolla.isCarRightHanded());
    }
}
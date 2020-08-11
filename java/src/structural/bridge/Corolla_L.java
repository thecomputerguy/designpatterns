public class Corolla_L extends AbstractCorolla {

    public Corolla_L(AbstractCorollaImpl abstractCorollaImpl) {
        super(abstractCorollaImpl);
    }

    @Override
    public void listSafetyEquipment() {
        this.abstractCorollaImpl.listSafetyEquipment();
    }

    @Override
    public boolean isCarRightHanded() {
        return this.abstractCorollaImpl.isCarRightHanded();
    }

}
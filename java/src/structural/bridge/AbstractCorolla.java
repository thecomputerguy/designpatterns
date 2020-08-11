public abstract class AbstractCorolla {

    protected AbstractCorollaImpl abstractCorollaImpl;

    public AbstractCorolla(AbstractCorollaImpl abstractCorollaImpl) {
        this.abstractCorollaImpl = abstractCorollaImpl;
    }

    public abstract void listSafetyEquipment();

    public abstract boolean isCarRightHanded();

    public void setAbstractCorollaImpl(AbstractCorollaImpl abstractCorollaImpl) {
        this.abstractCorollaImpl = abstractCorollaImpl;
    }
}
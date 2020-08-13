public class F16Observer implements IObserver, IAircraft {
    private ISubject subject;

    public F16Observer(ISubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void fly() {
        System.out.println("F16 is flying.");
    }

    public void land() {
        this.subject.removeObserver(this);
        System.out.println("F16 landed");
    }

    @Override
    public void update(Object newState) {
        // Take appropriate action based on new state.
        System.out.println("Observer received new state.");
        System.out.println(newState);
    }

}
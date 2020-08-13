public interface IObserver {

    // Receiving update as an object, it can specific entity representing the state
    // of the subject.
    public void update(Object update);
}
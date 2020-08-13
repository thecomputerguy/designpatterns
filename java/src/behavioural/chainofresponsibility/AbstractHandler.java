public class AbstractHandler {
    private AbstractHandler next;

    public AbstractHandler(AbstractHandler next) {
        this.next = next;
    }

    public void setNextHandler(AbstractHandler handler) {
        this.next = handler;
    }

    public void handleRequest(AbstractRequest request) {
        if (next != null) {
            System.out.println("Passing request to next handler.");
            next.handleRequest(request);
        }
    }
}
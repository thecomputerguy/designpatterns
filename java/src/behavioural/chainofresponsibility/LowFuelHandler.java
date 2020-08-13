public class LowFuelHandler extends AbstractHandler {

    private static int requestCode = 2;

    public LowFuelHandler(AbstractHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (requestCode == request.getRequestCode()) {
            // this handler can handle the request, so handle the request.
            System.out.println("Request handled by Low Fuel handler.");
        } else {
            // this handler can't handle the request. so forward the request to
            // the next handler in the chain.
            super.handleRequest(request);
        }
    }
}
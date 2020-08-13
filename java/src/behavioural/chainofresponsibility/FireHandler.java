public class FireHandler extends AbstractHandler {

    private static int requestCode = 1;

    public FireHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (requestCode == request.getRequestCode()) {
            // this handler can handler the request
            // handle request here.
            System.out.println("Fire handler is handling the request.");
        } else {
            // this handler cannot handle the request.
            // forward it to the next handler in the chain.
            super.handleRequest(request);
        }
    }
}
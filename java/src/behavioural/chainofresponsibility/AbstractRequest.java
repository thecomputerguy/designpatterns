public class AbstractRequest {
    private int code;

    public AbstractRequest(int requestCode) {
        this.code = requestCode;
    }

    public int getRequestCode() {
        return this.code;
    }
}
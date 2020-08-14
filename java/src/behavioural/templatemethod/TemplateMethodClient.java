public class TemplateMethodClient {

    public static void main(String[] args) {
        AbstractPreflightCheckList checkList = new F16PreflightCheckList();
        checkList.runCheckList();
    }
}
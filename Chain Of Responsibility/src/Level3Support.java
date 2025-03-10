public class Level3Support implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Level 3")) {
            System.out.println("Level 3 support is handling the request");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("Level3Support: I can't handle this request.");
            }
        }
    }
}

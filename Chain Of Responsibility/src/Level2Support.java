public class Level2Support implements SupportHandler{

    private SupportHandler nextHandler;
    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("Level 2")){
            System.out.println("Level 2 support is handling the request");
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }else{
                System.out.println("No support is available to handle the request");
            }
        }
    }
}

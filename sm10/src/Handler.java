public abstract class Handler {
    private Handler successor;
    public Handler(Handler s){
    successor = s;
    }
    public void handle() {
        if (successor != null) {
            successor.handle();
        }
    }
}
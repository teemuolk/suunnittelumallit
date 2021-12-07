public abstract class Raise {
    protected static final double BASE = 1;
    private Raise successor;
    public void setSuccessor(Raise successor) {
        this.successor = successor;
    }
    public void processRequest(RaiseRequest request){
        if (successor != null)
            successor.processRequest(request);
    }
}

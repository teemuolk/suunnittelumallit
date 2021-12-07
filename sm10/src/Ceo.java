public class Ceo extends Raise {
    private final double ALLOWABLE = 100 * BASE;
    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Ceo will approve " + request.getAmount() + "%");
        } else {
            super.processRequest(request);
        }
    }
}
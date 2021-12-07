public class Chief extends Raise {
    private final double ALLOWABLE = 6 * BASE;
    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
                    "Chief will approve " + request.getAmount()+ "%");
        } else {
            super.processRequest(request);
        }
    }
}
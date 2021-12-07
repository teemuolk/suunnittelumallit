public class Employee extends Raise {
    private final double ALLOWABLE = 3 * BASE;
    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
                    "Employee will approve " + request.getAmount() +"%");
        } else {
            super.processRequest(request);
        }
    }
}
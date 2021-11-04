package sm3;

public class Computer extends CompositeComponent {
    private int price; // Case price in this case

    public Computer(String caseName, int casePrice) {
        super(caseName, casePrice);
        this.price = casePrice;
    }
}

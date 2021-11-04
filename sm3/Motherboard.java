package sm3;

public class Motherboard extends CompositeComponent {
    private int price;

    public Motherboard(String name, int price) {
        super(name, price);
        this.price = price;
    }
}

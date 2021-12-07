public class Salami extends PizzaDecorator {

    public Salami(Pizza pizza) {
        super(pizza);
    }

    public String decorate() {
        return super.decorate() + decorateWithSalami();
    }

    private String decorateWithSalami() {
        return " with salami";
    }
}

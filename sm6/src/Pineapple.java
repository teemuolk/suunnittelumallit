public class Pineapple extends PizzaDecorator {

    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    public String decorate() {
        return super.decorate() + decorateWithPineapple();
    }

    private String decorateWithPineapple() {
        return " with pineapple";
    }
}

public class Ham extends PizzaDecorator {

    public Ham(Pizza pizza) {
        super(pizza);
    }

    public String decorate() {
        return super.decorate() + decorateWithHam();
    }

    private String decorateWithHam() {
        return " with ham";
    }
}

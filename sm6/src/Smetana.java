public class Smetana extends PizzaDecorator {

    public Smetana(Pizza pizza) {
        super(pizza);
    }

    public String decorate() {
        return super.decorate() + decorateWithSmetana();
    }

    private String decorateWithSmetana() {
        return " with smetana";
    }
}

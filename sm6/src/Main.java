public class Main {
    public static void main(String[] args) {
        Pizza firstPizza = new Pineapple(new Smetana(new PizzaImpl()));
        Pizza secondPizza = new Pineapple(new Salami(new PizzaImpl()));
        Pizza thirdPizza = new Pineapple(new Ham(new PizzaImpl()));
        System.out.println(firstPizza.decorate());
        System.out.println(secondPizza.decorate());
        System.out.println(thirdPizza.decorate());
    }

}
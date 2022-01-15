class Customer {
    public static void main(String[] args) {
        Director director = new Director();
        HeseBuilder burgerBuilder = new HeseBuilder();
        director.setBurgerBuilder(burgerBuilder);
        director.constructBurger();
        Kerroshampurilainen burger = burgerBuilder.getBurger();
        System.out.println(burger);
    }
}
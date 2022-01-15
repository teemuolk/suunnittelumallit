class Customer2 {
    public static void main(String[] args) {
        Director director = new Director();
        IBurgerBuilder burgerBuilder = new BigMacBuilder();
        director.setBurgerBuilder(burgerBuilder);
        director.constructBurger();
        Kerroshampurilainen burger = (Kerroshampurilainen) burgerBuilder.getBurger();
        System.out.println(burger);
    }
}
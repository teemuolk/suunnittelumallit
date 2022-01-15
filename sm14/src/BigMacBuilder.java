class BigMacBuilder implements IBurgerBuilder {
    private Kerroshampurilainen burger;
    public void createNewBurgerProduct(){ burger = new Kerroshampurilainen();}
    public Kerroshampurilainen getBurger(){ return burger;}
    public void buildBun() { burger.setBun("tuplasämpylä"); }
    public void buildSauce() { burger.setSauce("mac-kastike"); }
    public void buildSalad() { burger.setSalad("ameriikansalaatti"); }
}
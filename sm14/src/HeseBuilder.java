class HeseBuilder implements IBurgerBuilder {
    private Kerroshampurilainen burger;
    public void createNewBurgerProduct(){ burger = new Kerroshampurilainen();}
    public Kerroshampurilainen getBurger(){ return burger;}
    public void buildBun() { burger.setBun("sänpylä"); }
    public void buildSauce() { burger.setSauce("kerroskastike"); }
    public void buildSalad() { burger.setSalad("jäävuorisalaatti"); }
}
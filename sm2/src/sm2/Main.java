package sm2;


import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        AdidasFactory adidasFactory = new AdidasFactory();
        BossFactory bossFactory = new BossFactory();

        dress(jasper, adidasFactory);
        dress(jasper, bossFactory);
    }

    public static ClothesFactory createFactory(String factoryClassName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (ClothesFactory)
                Class.forName("sm2.%s".formatted(factoryClassName))
                        .getDeclaredConstructor()
                        .newInstance();
    }

    public static void dress(Jasper jasper, ClothesFactory factory) {
        jasper.clearItems();
        jasper.addItem(factory.createCap());
        jasper.addItem(factory.createJeans());
        jasper.addItem(factory.createShoes());
        jasper.addItem(factory.createTShirt());
        jasper.describeClothes();
    }
}
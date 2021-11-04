package sm2;

public class BossFactory implements ClothesFactory {
    private static final String BRAND = "Boss";

    @Override
    public Cap createCap() {
        return new Cap() {
            @Override
            public String getBrand() {
                return BRAND;
            }
        };
    }

    @Override
    public Jeans createJeans() {
        return new Jeans() {
            @Override
            public String getBrand() {
                return BRAND;
            }
        };
    }

    @Override
    public Shoes createShoes() {
        return new Shoes() {
            @Override
            public String getBrand() {
                return BRAND;
            }
        };
    }

    @Override
    public TShirt createTShirt() {
        return new TShirt() {

            @Override
            public String getBrand() {
                return BRAND;
            }
        };
    }
}
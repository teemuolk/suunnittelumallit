package sm2;

public abstract class TShirt extends ClothingItem {
    public abstract String getBrand();

    @Override
    public String toString() {
        return "t-paita (%s)".formatted(getBrand());
    }
}
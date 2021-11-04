package sm2;

public abstract class Shoes extends ClothingItem {
    public abstract String getBrand();

    @Override
    public String toString() {
        return "kengät (%s)".formatted(getBrand());
    }
}
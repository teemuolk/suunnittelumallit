package sm2;

public abstract class Jeans extends ClothingItem {
    public abstract String getBrand();

    @Override
    public String toString() {
        return "farmarit (%s)".formatted(getBrand());
    }
}
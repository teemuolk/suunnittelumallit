package sm2;


public abstract class Cap extends ClothingItem {
    public abstract String getBrand();

    @Override
    public String toString() {
        return "lippis (%s)".formatted(getBrand());
    }
}
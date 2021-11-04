package sm2;

import java.util.ArrayList;


public class Jasper {
    private final ArrayList<ClothingItem> clothes = new ArrayList<>();

    public void addItem(ClothingItem item) {
        clothes.add(item);
    }

    public void clearItems() {
        clothes.clear();
    }

    public void describeClothes() {
        String[] items = clothes.stream().map(ClothingItem::toString).toArray(String[]::new);
        System.out.printf("Minulla on päälläni %s\n", String.join(", ", items));
    }
}
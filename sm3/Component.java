package sm3;

import java.util.Optional;

public abstract class Component {
    private String name;
    private int price;

    public Component(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    protected abstract void add(CompositeComponent compositeComponent);

    protected abstract <T> Optional<T> stream();
}

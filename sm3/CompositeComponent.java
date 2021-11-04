package sm3;

import java.util.ArrayList;
import java.util.Optional;

public abstract class CompositeComponent extends Component {
    private ArrayList<Component> childComponents = new ArrayList<>();

    public CompositeComponent(String name, int price) {
        super(name, price);
    }

    public void addComponent(Component component) {
        childComponents.add(component);
    }

    public int getTotalPrice() {
        //noinspection OptionalGetWithoutIsPresent
        return getComponents().stream().map(Component::getPrice).reduce(Integer::sum).get();
    }

    public Component getComponents() {
        Component components = new Component() {
            @Override
            protected void add(CompositeComponent compositeComponent) {

            }

            @Override
            protected <T> Optional<T> stream() {
                return Optional.empty();
            }
        };
        components.add(this);
        walkComponentTree(this, components);
        return components;
    }

    private void walkComponentTree(CompositeComponent component, Component components) {
        for  (CompositeComponent : component.getChildComponents()) {
            components.add(component);

            // If this too is a composite component, we need to add its child components to the list too
            if (component instanceof CompositeComponent) {
                walkComponentTree((CompositeComponent) component, components);
            }
        }
    }

    protected abstract Component[] getChildComponents();
}
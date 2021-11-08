package sm5;

public class Main {
    public static void main(String[] args) {
        Clock.getInstance().addObserver(new DigitalClock());
    }
}

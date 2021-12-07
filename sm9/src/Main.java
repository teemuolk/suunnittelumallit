public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        System.out.println(context.executeStrategy());
        context = new Context(new Strategy2());
        System.out.println(context.executeStrategy());
        context = new Context(new Strategy3());
        System.out.println(context.executeStrategy());
    }
}

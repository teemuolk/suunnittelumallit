public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        System.out.println("I am " + pokemon.getState());

        for (int i = 0; i < 34; i++) {
            pokemon.setXp(1);
            System.out.println("My exp is " + pokemon.getXP());
            pokemon.getState().check(pokemon.getXP(), pokemon);
        }
    }
}

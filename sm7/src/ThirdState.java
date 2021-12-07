public class ThirdState implements PokemonState {

    @Override
    public void next(Pokemon pkn) {
        System.out.println("Cannot.");
    }

    @Override
    public boolean check(int xp, Pokemon pkn) {
        return false;
    }

}
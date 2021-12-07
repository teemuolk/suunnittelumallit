public class FirstState implements PokemonState {
    private Pokemon pkn;

    @Override
    public void next(Pokemon pkn) {
        pkn.setState(new SecondState());
        System.out.println("Evolved into Pikachu");
    }

    @Override
    public boolean check(int xp, Pokemon pkn) {
        if (xp >= 16) {
            next(pkn);
            return true;
        } else {
            return false;
        }
    }

}
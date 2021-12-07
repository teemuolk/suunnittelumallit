public class SecondState implements PokemonState {


    @Override
    public void next(Pokemon pkn) {
        pkn.setState(new ThirdState());
        System.out.println("Evolved into 2nd Pikachu");
    }

    @Override
    public boolean check(int xp, Pokemon pkn) {
        if (xp >= 28) {
            next(pkn);
            return true;
        } else {
            return false;
        }
    }

}
public interface PokemonState {

    void next(Pokemon pkn);
    boolean check(int xp, Pokemon pkn);

}
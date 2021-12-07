public class Pokemon {

    private PokemonState state = new FirstState();
    private int xp = 0;

    public void setState(PokemonState state){
        this.state = state;
    }

    public PokemonState getState(){
        return state;
    }

    public void setXp(int xp){
        this.xp += xp;
    }

    public int getXP(){
        return this.xp;
    }

    public void nextState() {
        state.next(this);
    }

}
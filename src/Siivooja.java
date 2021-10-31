public class Siivooja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Pontikka();
    };
    public Ruoka createRuoka() { return new NakitJaMuusi(); };
}

public class Kello implements Cloneable {
    private Viisari isoViisari;
    private Viisari keskiViisari;
    private Viisari pieniViisari;

    public void setAika(int isoViisari, int keskiViisari, int pieniViisari) {
        this.isoViisari.setArvo(isoViisari);
        this.keskiViisari.setArvo(keskiViisari);
        this.pieniViisari.setArvo(pieniViisari);

    }


    public Kello (Viisari isoViisari, Viisari keskiViisari, Viisari pieniViisari){
        this.isoViisari = isoViisari;
        this.keskiViisari = keskiViisari;
        this.pieniViisari = pieniViisari;
    }
    public Kello clone() {
        Kello s = null;
        try {
            s = (Kello)super.clone();
            s.isoViisari = (Viisari)isoViisari.clone();
            s.keskiViisari = (Viisari)keskiViisari.clone();
            s.pieniViisari = (Viisari)pieniViisari.clone();
        } catch (CloneNotSupportedException e) {}
        return s;
    }

    public String toString(){
        return " on " + isoViisari.getArvo() + ":" + keskiViisari.getArvo() + ":" + pieniViisari.getArvo();
    }
}

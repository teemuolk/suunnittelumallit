public class Main {
    public static void main(String[] args){
        Kello kello = new Kello(new Viisari(13), new Viisari(36), new Viisari(39));
        System.out.println("Kello" + kello.toString());
        Kello kloonattuKello = kello.clone();
        System.out.println("Kloonattu kello" + kloonattuKello.toString());
        kello.setAika(03, 12, 62);
        System.out.println("Kello" + kello.toString());
        System.out.println("Kloonattu kello" + kloonattuKello.toString());
        kloonattuKello.setAika(01, 52, 02);
        System.out.println("Kello" + kello.toString());
        System.out.println("Kloonattu kello" + kloonattuKello.toString());
    }
}

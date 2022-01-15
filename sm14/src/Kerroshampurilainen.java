public class Kerroshampurilainen {
    private String bun = "";
    private String sauce = "";
    private String salad = "";

    public void setBun(String bun) { this.bun = bun; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void setSalad(String salad) { this.salad = salad; }

    public String toString() {
        return "Burgerin sisältö on " + this.bun + ", " + this.sauce + " ja " + this.salad;
    }
}
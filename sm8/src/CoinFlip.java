public class CoinFlip extends Game {

    public void initializeGame() {
        System.out.println("Game initialized");
        System.out.println("Flipping coin...");
    }

    public void makePlay(int player) {
    }

    public boolean endOfGame() {
        int x = 0;
        x = (int) (Math.random() * 2);
        if (x == 0){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
        System.out.println("Game ended");
        return true;
    }

    public void printWinner() {
        System.out.println("Congratulations to the player who chose correclty!");
    }

}


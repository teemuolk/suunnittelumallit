package sm3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("CORSAIR Obsidian Series 1000D", 100);
        Motherboard motherboard = new Motherboard("ASRock X399 Taichi sTRX4", 150);
        motherboard.addComponent(new CPU("AMD Ryzen Threadripper 3990WX", 250));
        motherboard.addComponent(new GPU("NVIDIA GeForce RTX 3090", 300));
        motherboard.addComponent(new Memory("Corsair Vengeance 64GB", 125));
        computer.addComponent(motherboard);

        System.out.println(computer.getComponents());
        System.out.println(computer.getTotalPrice());
    }
}

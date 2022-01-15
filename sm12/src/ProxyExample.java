import java.util.ArrayList;

class ProxyExample {

    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("Potato");

        ArrayList<Image> folder = new ArrayList<>();
        folder.add(image1);
        folder.add(image2);
        folder.add(image3);

        for (int i = 0; i  < folder.size(); i++) {
            folder.get(i).showData();
        }

        for (int i = 0; i  < folder.size(); i++) {
            folder.get(i).displayImage();
        }


    }
}
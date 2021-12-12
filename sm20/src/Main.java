import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Iterator<Integer> i = list.iterator();


        MyThread threadOne = new MyThread(i);
        MyThread threadTwo = new MyThread(i);
        MySecondThread threadThree = new MySecondThread(i);


        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}

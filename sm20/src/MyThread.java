import java.util.Iterator;

public class MyThread extends Thread
{

    Iterator<Integer> i;

    public MyThread(Iterator<Integer> i)
    {
        this.i = i;
    }

    public void run()
    {
        while (this.i.hasNext()) {
            Integer num = this.i.next();

        }
    }
}
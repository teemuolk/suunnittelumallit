import java.util.Iterator;

public class MySecondThread extends Thread
{

    Iterator<Integer> i;

    public MySecondThread(Iterator<Integer> i)
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
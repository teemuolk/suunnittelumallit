import java.util.Iterator;
import java.util.List;

public class Strategy1 implements ListConverter{

    private String listString = "";

    @Override
    public String listToString(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            listString += iterator.next() + "\n";
        }

        return listString;
    }
}
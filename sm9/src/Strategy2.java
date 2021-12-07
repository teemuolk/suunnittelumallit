import java.util.List;

public class Strategy2 implements ListConverter{

    private String listString = "";

    @Override
    public String listToString(List<String> list) {
        for (int i= 0; i < list.size(); i++){
            if (i % 2 == 0){
                listString += list.get(i);
            } else {
                listString += list.get(i) + "\n";
            }
        }
        return listString;
    }
}
import java.util.List;

public class Strategy3 implements ListConverter{

    private String listString = "";

    @Override
    public String listToString(List<String> list) {

        String[] strArray = new String[list.size()];
        strArray = list.toArray(strArray);
        for (int i = 1; i < strArray.length+1; i++){
            if (i % 3 == 0){
                listString += strArray[i-1] + "\n";
            } else {
                listString += strArray[i-1];
            }
        }
        return listString;
    }
}
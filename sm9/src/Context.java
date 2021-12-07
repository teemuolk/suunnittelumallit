import java.util.ArrayList;
import java.util.List;

public class Context {
    private ListConverter listConverter;
    private List<String> list = new ArrayList<>();

    public Context(ListConverter listConverter){
        this.listConverter = listConverter;
        this.list.add("1");
        this.list.add("2");
        this.list.add("3");
        this.list.add("4");
        this.list.add("5");
        this.list.add("6");
        this.list.add("7");
        this.list.add("8");
        this.list.add("9");
        this.list.add("10");
        this.list.add("11");
        this.list.add("12");
    }

    public String executeStrategy(){
        return listConverter.listToString(this.list);
    }
}

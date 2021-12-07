import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Chief chief = new Chief();
        Ceo ceo = new Ceo();
        employee.setSuccessor(chief);
        chief.setSuccessor(ceo);
// Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount of raise to check who should approve your raise.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new
                        InputStreamReader(System.in)).readLine());
                employee.processRequest(new RaiseRequest(d, "General"));
            }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}
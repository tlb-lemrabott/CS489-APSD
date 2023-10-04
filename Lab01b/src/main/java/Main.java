import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PensionPlan p1 = new PensionPlan("EX1089",LocalDate.of(2023, 01, 17), 100.00f);

        Employee e1 = new Employee(123l, "Daniel", "Agar", LocalDate.of(2018, 01, 17), 105945.50f, p1 );
        Employee e2 = new Employee(456l, "Benard", "Shaw", LocalDate.of(2018, 10, 03), 197750.00f, p1 );

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        for(Employee e: employeeList){
            System.out.println(e.toJSON_Format(e));
        }
    }
}

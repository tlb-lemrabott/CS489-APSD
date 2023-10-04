import lombok.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private Float yearlySalary;
    private PensionPlan pensionPlan;

    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, Float yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    public String toJSON_Format(Employee employee){
        return String.format("\"employeeId\":%d, \"firstName\":%s, \"lastName\":%s, \"employmentDate\":%s, \"yearlySalary\":%.2f, \"pensionPlan\":%s"
                ,employee.getEmployeeId(),employee.getFirstName(),employee.getLastName(),employee.getEmploymentDate(),employee.getYearlySalary()
                ,employee.getPensionPlan().toString());
    }
}

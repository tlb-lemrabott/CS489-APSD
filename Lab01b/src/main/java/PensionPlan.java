import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private Float monthlyContribution;
}

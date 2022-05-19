package adepojugrace.dolly.serverquiz;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Data
public class Question {
    private String question;
    private String answer;
}

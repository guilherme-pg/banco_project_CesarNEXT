package school.cesar.nib.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String CPF;
    private String name;
    private Account account;
}

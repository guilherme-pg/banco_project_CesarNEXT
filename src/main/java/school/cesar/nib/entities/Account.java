package school.cesar.nib.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String number;
    private double balance;
    private String password;

    public void credit(double value) {
        balance += value;
    }

    public void debit(double value) {
        balance -= value;
    }
}

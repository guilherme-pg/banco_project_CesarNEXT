package school.cesar.nib.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Savings extends Account {

    public void yieldInterest(){
        double actualBalance = getBalance();
        setBalance( actualBalance * 1.005  );
    }
}

package POO.aula04;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountHolder ana = new AccountHolder("Ana","Silva",24, "2342", "1098-0");

        System.out.println(ana.getName());
        ana.setAge(34);
        ana.putMoney(500);

        System.out.println(ana.getCurrentBalance());
        System.out.println(ana.getLoanAmount());

        ana.withdrawMoney(25);

        System.out.println(ana.getCurrentBalance());
        System.out.println(ana.getValueDebt());

        ana.applyBankLoan();
        ana.status();

        ana.payValueDebt();
        ana.putMoney(700);
        ana.payValueDebt();

        ana.status();
        ana.applyBankLoan();
        ana.payValueDebt();

        AccountHolder carlos = new AccountHolder("Carlos","Castro",62, "123","6870-2",7345.89);
        carlos.status();
        carlos.payValueDebt();

        AccountHolder amanda = new AccountHolder("Amanda","Silva",17, "647","6390-4");

        amanda.applyBankLoan();

        System.out.println();

        List<AccountHolder> accountHolders = Arrays.asList(carlos, ana, amanda);

        for(int i = 0; i < accountHolders.size(); i++){
            AccountHolder holder = (AccountHolder) accountHolders.get(i);

            if(holder.getCurrentBalance() > 2000){
                System.out.println(holder.getName());
            }
        }
    }
}

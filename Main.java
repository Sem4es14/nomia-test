import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(new int[]{0, 0, 1, 2, 1});
        System.out.println(Arrays.toString(atm.withdraw(600)));

        ATM atm1 = new ATM();
        atm1.deposit(new int[]{0, 1, 0, 1, 1});
        System.out.println(Arrays.toString(atm1.withdraw(600)));
        System.out.println(Arrays.toString(atm1.withdraw(550)));

        ATM atm2 = new ATM();
        atm2.deposit(new int[]{0, 1, 0, 1, 50});
        System.out.println(Arrays.toString(atm2.withdraw(20050)));
        System.out.println(Arrays.toString(atm2.withdraw(20000)));
        System.out.println(Arrays.toString(atm2.withdraw(5000)));
    }

}

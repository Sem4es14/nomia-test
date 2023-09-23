import java.util.Arrays;

public class ATM {
    private final int[] bank;
    private static final int[] DENOMINATIONS = new int[]{10, 50, 100, 200, 500};

    public ATM() {
        bank = new int[]{0, 0, 0, 0, 0};
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < banknotesCount.length; i++) {
            bank[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] response = new int[5];
        int[] currentBank = Arrays.copyOf(bank, bank.length);
        while (amount != 0) {
            boolean isWithdrawn = false;
            for (int i = DENOMINATIONS.length - 1; i >= 0; i--) {
                if (amount >= DENOMINATIONS[i] && currentBank[i] > 0) {
                    response[i]++;
                    currentBank[i]--;
                    amount -= DENOMINATIONS[i];
                    isWithdrawn = true;
                    break;
                }
            }
            if (!isWithdrawn) return new int[]{-1};
        }

        System.arraycopy(currentBank, 0, bank, 0, currentBank.length);

        return response;
    }
}
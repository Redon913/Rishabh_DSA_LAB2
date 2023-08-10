import java.util.*;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int n = scanner.nextInt();
        
        int[] denominations = new int[n];
        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        Arrays.sort(denominations);
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        
        int noteCount;
        for (int i = n - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                noteCount = amount / denominations[i];
                System.out.println(denominations[i] + ":" + noteCount);
                amount %= denominations[i];
            }
        }

        scanner.close();
    }
}

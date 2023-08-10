import java.util.Scanner;

public class PayMoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of transaction array: ");
        int numTransactions = scanner.nextInt();
        int[] transactions = new int[numTransactions];

        System.out.println("Enter the values of array: ");
        for (int i = 0; i < numTransactions; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        for (int t = 0; t < numTargets; t++) {
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();

            int result = achieveTarget(transactions, target);
            if (result != -1) {
                System.out.println("Target achieved after " + result + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }
    }

    public static int achieveTarget(int[] transactions, int target) {
        int currentSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            currentSum += transactions[i];
            if (currentSum >= target) {
                return i + 1; // +1 because transactions are 1-indexed
            }
        }
        return -1; // Target not achieved
    }
}

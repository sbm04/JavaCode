package array;
import java.util.Scanner;

public class EthanandOliver {
    // Function to check if the current player can win
    private static String determineWinner(int N, int P, int X, int M) {
        // If P is already at X, Oliver wins immediately as he starts first
        if (P == X) {
            return "Oliver";
        }

        // Calculate the distance from P to X
        int distance = Math.abs(P - X);

        // If the distance is divisible by M (Oliver or Ethan can directly reach X)
        if (distance % M == 0) {
            // If the number of moves is odd, Oliver wins
            if ((distance / M) % 2 == 1) {
                return "Oliver";
            } else {
                return "Ethan";
            }
        }

        // Otherwise, it's a draw if they can't perfectly reach X
        return "Draw";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input values
        int N = sc.nextInt(); // Number of coins
        int P = sc.nextInt(); // Position of the genuine coin (1-based index)
        int X = sc.nextInt(); // Target position (1-based index)
        int M = sc.nextInt(); // Number of consecutive coins to reverse in each move

        // Determine the winner
        String result = determineWinner(N, P, X, M);

        // Output the result
        System.out.println(result);

        sc.close();
    }
}



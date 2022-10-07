import java.util.*;
import java.io.*;
import java.math.*;

public class Sales {

    public static int calculateTotalPrice(int[] prices, int discount) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        /*
         * Constraints:
         * 0 ≤ discount ≤ 100
         * 0 < price of a product < 100000
         * 0 < number of products < 100
         */

        int mostExpensive = 0;
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (0 > discount || discount > 100 || 0 > prices[i] || prices[i] > 100000 || prices.length > 100) {
                System.err.println("unvalid value.");
            }

            if (mostExpensive < prices[i]) {
                mostExpensive = prices[i];
            }
            total += prices[i];
        }

        return (int) Math.floor(total - (mostExpensive * discount / 100.0f));
    }

    // #region main

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int discount = in.nextInt();
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount);
        System.setOut(outStream);
        System.out.println(price);
    }
    // #endregion
}

import java.util.*;
import java.io.*;
import java.math.*;

public class Sales {

    public static int calculateTotalPrice(int[] prices, int discount) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        return -1;
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

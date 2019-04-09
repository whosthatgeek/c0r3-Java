package hacckerrank.day30;

import java.util.Scanner;

public class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i < 11; i++)
            System.out.printf ("%d x %d = %d\n",n, i, n * i);

        scanner.close();
    }
}

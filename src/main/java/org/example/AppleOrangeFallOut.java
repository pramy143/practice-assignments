package org.example;

import java.util.Scanner;

public class AppleOrangeFallOut {
    // Complete the countApplesAndOranges function below.

    /**
     * s: integer, starting point of Sam's house location.
     * t: integer, ending location of Sam's house location.
     * a: integer, location of the Apple tree.
     * b: integer, location of the Orange tree.
     * apples: integer array, distances at which each apple falls from the tree.
     * oranges: integer array, distances at which each orange falls from the tree.
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        Integer appleFalloutCount = 0;
        Integer orangeFalloutCount = 0;
        for (Integer apple: apples) {
            if((a+apple) >= s && (a+apple) <= t) {
                ++appleFalloutCount;
            }
        }
        System.out.println(appleFalloutCount);
        for (Integer orange: oranges) {
            if((b+orange) <= t && (b+orange) >= s) {
                ++orangeFalloutCount;
            }
        }

        System.out.println(orangeFalloutCount);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

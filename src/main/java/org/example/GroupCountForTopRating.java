package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class GroupCountForTopRating {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        String[] input3 = input.next().split(",");
        int[] input4 = new int[input3.length];
        for(int i = 0; i < input3.length; i++) {
            input4[i] = Integer.valueOf(input3[i]);
        }
        System.out.println(callHelper(input1, input2, input4));
    }

    private static int callHelper(final int input1, final int input2, final int[] input4) {
        int sum = 0;
        Arrays.sort(input4);
        for(int i = input1-1; i >= (input1 - input2); --i) {
            sum = sum + input4[i];
        }
        if(sum > 0) {
            return sum;
        }

        throw new UnsupportedOperationException("this is not supported:");
    }
}

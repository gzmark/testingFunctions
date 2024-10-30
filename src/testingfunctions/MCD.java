package testingfunctions;

import java.util.Arrays;
import java.util.Scanner;

public class MCD {

    static Scanner input = new Scanner(System.in);

    static void fun() {
        int[] nums = new int[5];
        for (int index = 0; index < nums.length; index++) {
            nums[index] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }

    static int mcd(int num1, int num2) {
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 % num2 == 0) {
            return num2;
        }
        while (num1 % num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num2;
    }

    static boolean isPrime(int num) {
        int c = 2;
        while (c < num) {
            if (num % c == 0) {
                return false;
            }
            c += 1;
        }
        return true;
    }

    static String primeNums(int num) {
        int[] nums = new int[num];
        int[] res = new int[num];
        for (int index = nums.length - 1; index >= 0; index--) {
            nums[index] = num--;
        }
        //System.out.println(Arrays.toString(nums));
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (isPrime(nums[index])) {
                res[count++] = nums[index];
            }

        }
        return Arrays.toString(res);
    }

}

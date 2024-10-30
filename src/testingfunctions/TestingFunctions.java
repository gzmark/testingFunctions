package testingfunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestingFunctions {

    //  static MCD obj = new MCD();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        String sentence = "abcdefghijklmnopqrstuvwxyz";
//        System.out.println(checkIfPangram(sentence));
        // nums  8 1 2 3 4
        // index 0 1 2 2 1
        // expec 8 4 1 3 2
        //System.out.println(numbers(10));
        numbers(10);
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        int[] index = new int[5];
        index[0] = 0;
        index[1] = 1;
        index[2] = 2;
        index[3] = 2;
        index[4] = 1;

        //System.out.println(Arrays.toString(moveArrayx(arr, index)));
        //System.out.println(numIdenticalPairs(arr));
//        System.out.println(kidsWithCandies(arr, 5));
//        System.out.println(Arrays.toString(shuffle(arr)));
        //System.out.println(sum());
        //int num = input.nextInt();
        //twoDArr();
//        System.out.println(MCD.primeNums(7));
//        int start = 0;
//        System.out.println("ingresa numero:");
//        int num = input.nextInt();
//        while (num != 0) {
//            start = start + num;
//            System.out.println("next number?");
//            num = input.nextInt();
//        }
//        System.out.println("res: " + start);
//        Scanner input = new Scanner(System.in);
//        System.out.println("num?");
//        int num = input.nextInt();
//        boolean res = MCD.isPrime(num);
//        if (res == true) {
//            System.out.println("El numero " + num + " es primo!!");
//        } else {
//            System.out.println("El numero " + num + " no es primo!!");
//        }
//        System.out.println("ingresa numero");
//           //MCD.fun();
//        int num =  MCD.mcd(104, 160);
//        System.out.println(num);
        //boolean result = isLeap(year);
        //System.out.println(result);
        //int n1=in.nextInt();
        //int n2=in.nextInt();
        //System.out.println(mcd(5,6));
        //int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "c'mon, gimme a number"));
        //System.out.println("number?");
        //int num = in.nextInt();
        //multiplication(num2);
        //System.out.println(sumVar(1,2));
        //System.out.println("ingrese year");
        //System.out.println("num1?");
        //int num1 = in.nextInt();
        //System.out.println("num2?");
        //int num2 = in.nextInt();
        //int sum = sum(num1, num2);
        //System.out.println("resultado:");
        //System.out.println(sum);
    }

    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        } else {
            for (Character a = 'a'; a <= 'z'; a++) {
                if (!sentence.contains(a.toString())) {
                    return false;
                }
            }
        }
        return true;
    }

    static void numbers(int num) {
        //int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " ");
        }
    }

    // 0 1 2 3 4 5
    // 4 5 5 6 7 -
    // nums  8 10 20 30 40
    // index 0  1  2  2 1
    // expec 8 4 1 3 2
    static int[] moveArray(int[] arr, int ind[]) {
        int[] target = new int[arr.length];
        int count = -1;
        int temp;
        int insert;
        for (int x = 0; x < arr.length; x++) {
            count++;
            if (ind[x] < count) {
                temp = ind[x];//2
                insert = arr[x];
                // for (int i = 0; i < arr.length - 1; i++) {
                //if (temp == i) {
                // System.out.println("ffjfj");
                for (int j = arr.length - 2; j >= temp; j--) {
                    target[j + 1] = target[j];
                    //target[j] = insert;
                    // 4 5 5 6 7 -
                    // 0 4 5 5 6 7
                }
                System.out.println(Arrays.toString(arr));
                //   }}              
                target[temp] = insert;
                //target[x] = arr[temp];
                System.out.println("x " + x + " temp " + temp);
            } else {
                target[x] = arr[x];
            }

        }
//        for (int a = 0; a < ind.length; a++) {
//            temp = ind[a];
//            System.out.println(Arrays.toString(ind));
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (temp == i) {
//                    System.out.println("ffjfj");
//                    for (int j = arr.length - 2; j >= temp; j--) {
//                        arr[j + 1] = arr[j];
//                        arr[j] = 0;
//                    }
//                    System.out.println(Arrays.toString(arr));
//                }
//            }
//        }
//        System.out.println("");
        return target;
    }

    static int[] moveArrayw(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        int count = -1;
        int temp;
        int insert;

        for (int i = 0; i < nums.length; i++) {
            count++;
            if (index[i] < count) {
                temp = index[i];
                insert = nums[i];
                for (int j = nums.length - 2; j >= temp; j--) {
                    target[j + 1] = target[j];
                }
                target[temp] = insert;
            } else {
                target[i] = nums[i];
            }
        }
        return target;
    }

    static Object[] moveArrayx(int[] nums, int[] index) {
        LinkedList<Integer> listaLigada = new LinkedList<>();

        for (int i = 0; i < index.length; i++) {
            listaLigada.add(index[i], nums[i]);
        }

        return listaLigada.toArray();
    }

// 0 1 2 3
// 2 4 4 4
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp;
        int count;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (temp > nums[j]) {
                    count++;
                }
                arr[i] = count;
            }
        }
        return arr;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int temp;

        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatVal = 0;
        int total;
        List<Boolean> values = new ArrayList();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatVal) {
                greatVal = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            total = candies[i] + extraCandies;
            boolean value = total >= greatVal;
            values.add(value);
        }
        return values;

    }

    static public int[] shuffle(int[] nums) {
        int[] temp1 = new int[nums.length / 2];
        int[] temp2 = new int[nums.length / 2];

        int[] arr = new int[nums.length];

        for (int i = 0; i < temp1.length; i++) {
            temp1[i] = nums[i];
            temp2[i] = nums[i + temp1.length];
        }
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = temp1[i / 2];
            arr[i + 1] = temp2[i / 2];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("");

        for (int a : nums) {
            System.out.println(a);
        }

        System.out.println("");

        return arr;

    }

    static boolean isLeap(int year) {
        return year % 4 == 0;
    }

    static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static void multiplication(int num) {
        int counter = 1;
        for (int index = 0; index < 10; index++) {
            int res = num * counter;
            System.out.println(num + " * " + counter + " = " + res);
            counter++;
        }
    }

    static int sumVar() {
        int count = 0;
        int sum = 0;
        String temp = input.nextLine();
        while (!temp.equals("x")) {
            sum = Integer.parseInt(temp);
            count = count + sum;
            temp = input.nextLine();
        }
        return count;
    }

    public static int sum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int numString;
        String numInput = sc.nextLine();
        while (!numInput.equals("x")) {
            numString = Integer.parseInt(numInput);
            sum = sum + numString;
            numInput = input.nextLine();
        }
        return sum;
    }

    static void twoDArr() {
        int[][] nums = new int[3][3];
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                nums[row][column] = input.nextInt();
            }
        }

        for (int[] a : nums) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("");

        for (int row = 0; row < nums.length; row++) {
            System.out.println(Arrays.toString(nums[row]));
//            for (int column = 0; column < nums[row].length; column++) {
//                System.out.print(nums[row][column] + " ");
//            }
            //System.out.println("");
        }

    }

    static boolean bis(int n) {
        if (n % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        // int x = 10;
        // int res = x++ + ++x;

        // System.out.println(x);
        // System.out.println(res);

        // int a = 123;
        // int b = 321;
        // int c = 600;
        // int big = a < b ? a : b;
        // int biggest = (a > b && a > c) ? a : (b > c ? b : c);
        // System.out.println(biggest);
        // int a = 1 + (int) (Math.random() * 100);
        // int b = 1 + (int) (Math.random() * 100);
        // int c = 1 + (int) (Math.random() * 100);
        // System.out.println(a + " " + b + " " + c);
        // int biggest = (a > b && a > c) ? a : (b > c ? b : c);
        // System.out.println(biggest);
        // int n = 1 + (int) (Math.random() * 100);
        // System.out.println("Number genrated= " + n);
        // if (n % 3 == 0 && n % 7 == 0) {
        // System.out.println(n + " is divsible by 3 and 7");
        // } else {
        // System.out.println(n + " is not divsible by 3 and 7");
        // }

        // if else statement
        // int a = 10;
        // int b = 20;
        // foreacch
        // for(item:group){
        // System.out.println(item);
        // }

        // int marks = 1 + (int) (Math.random() * 100);
        // if (marks >= 85)
        // System.out.println("Grade : A+");
        // else if (marks >= 70)
        // System.out.println("Grade : A");
        // else if (marks >= 60)
        // System.out.println("Grade : B");
        // else if (marks >= 50)
        // System.out.println("Grade : C");
        // else if (marks >= 40)
        // System.out.println("Grade : D");
        // else

        // System.out.println("Grade : Fail");
        // int dayNo = Integer.parseInt(args[0]);
        // switch (dayNo) {
        // case 1:
        // System.out.println("Its monday");

        // break;
        // case 2:
        // System.out.println("Its tue");

        // break;
        // case 3:
        // System.out.println("Its wed");

        // break;
        // case 4:
        // System.out.println("Its thu");

        // break;
        // case 5:
        // System.out.println("Its frid");

        // break;
        // case 6:
        // System.out.println("Its sat");

        // break;
        // case 7:
        // System.out.println("Its sun");

        // break;

        // default:
        // System.out.println("pelase eveter 1 to 7 numbers only!");

        // }

        // for each demo
        // int[] arr = { 1, 4, 5, 7, 9, 67, 200, 169, 289 };
        // System.out.println(arr.length);
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // break demo
        // for (int i = 5; i <= 100; i = i + 5) {
        // System.out.println(i);
        // if (i == 50) {
        // break;
        // }
        // }
        // continue demo
        // for (int i = 5; i <= 50; i++) {
        // if (i > 25 && i <= 40)
        // continue;
        // System.out.println(i);
        // }

        // for (int i = 65; i <= 165; i++) {
        // if (i > 90 && i < 97) {
        // continue;
        // }
        // if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
        // System.out.print((char) i + " ");
        // }
        // }
        // int n1 = (int) (Math.random() * 10);
        // int n2 = (int) (Math.random() * 10);

        // if (n2 == 0)
        // return;

        // int res = n1 / n2;
        // System.out.println(res);

        // int prod = n1 * n2;
        // System.out.println(prod);
        ///array start
        // int[] arr;// declare array
        // String[] cities;// declare array
        // double[] temp;// declare array
        // char[] vovels;// declare array

        // arr = new int[144]; // defiantion of array
        // cities = new String[5];
        // temp = new double[12];
        // vovels = new char[10];

        // int[] marks = new int[10];
        // int[] marks = { 1, 23, 4, 5, 6 };

        // System.out.println(marks.length);

        // String[] citireStrings = { "indore", "bhopal", "narsigngarh" };
        // System.out.println(citireStrings.length);
        // for (int i = 0; i < citireStrings.length; i++) {
        // System.out.println(citireStrings[i]);
        // }
        // for (String string : citireStrings) {
        // System.err.println(string);
        // }
        // double[] randomNumbers = new double[10];
        // for (int i = 0; i < randomNumbers.length; i++) {
        // randomNumbers[i] = Math.random();
        // }
        // for (double d : randomNumbers) {
        // System.out.println(d);
        // }

        // array new topics
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) (Math.random() * 100);
            sum += arr[i];
        }
        for (int i : arr) {
            System.out.println(i);
        }

        // min and max
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        ////search element in array
        System.out.println(" Min: " + min + " Max: " + max);
        System.out.println("Please enter element of search!");
        int x = in.nextInt();
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(x + " is found at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println(x + " is not found!");
        ////shorting in array
        System.out.println("Shorted Array");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        // 2d array
        int[][] marks = {
                { 90, 85, 88 }, // Student 1 ke marks (3 subjects)
                { 78, 92, 80 } // Student 2 ke marks (3 subjects)
        };
        for (int i = 0; i < 2; i++) { // 2 rows
            for (int j = 0; j < 3; j++) { // 3 columns
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
        // 3d array
        int[][][] scores = {
                { { 90, 85 }, { 78, 92 } }, // Class 1 ke 2 students (2 subjects each)
                { { 88, 95 }, { 80, 87 } } // Class 2 ke 2 students (2 subjects each)
        };
        for (int i = 0; i < 2; i++) { // 2 classes
            for (int j = 0; j < 2; j++) { // 2 students
                for (int k = 0; k < 2; k++) { // 2 subjects
                    System.out.print(scores[i][j][k] + " ");
                }
                System.out.println(); // New line after each student
            }
            System.out.println("---"); // Separator for classes
        }
    }
}
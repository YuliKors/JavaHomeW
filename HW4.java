import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.math.BigDecimal;

public class HW4 {
    public void task1() {
        double e = 0.0;
        int i = 0;
        while (true) {
            double temp = e;
            e += 1.0 / fact(i);
            if (e - temp < 0.0000001)
                break;
            i++;
        }
        System.out.println("e = " + e);
    }

    public static long fact(int n) {
        long f = 1L;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public void task2() {
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }

    public void task3() {
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print(" " + "#");
            {
                System.out.println();
            }
        }
        int B = 8;
        for (int i = 8 - 1; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(" " + "#");
            }
            {
                System.out.println();
            }
        }
        int i, j, k;
        for(i=8;i>=1;i--)
        {
            for(j=8;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }


        for(i=8;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=8;k>=i;k--)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        }



            public void task4 () {
                double number;
                System.out.println("Please, input double number: ");
                Scanner input = new Scanner(System.in);
                number = input.nextDouble();
                String testString = Double.toString(number);
                System.out.println(testString.replaceAll("", " "));
            }
        public void task5 () {
            for (int i = 1; i <= 5; ++i) {
                for (int j = 5; j > i; --j)
                    System.out.print(" ");
                for (int j = 1; j < 1 * (i + 1); ++j)
                    System.out.print("* ");
                {
                    System.out.println();
                }
            }
        }
    }
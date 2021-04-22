import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW3 {
    public void task1() {
int a, b, c, d;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = input.nextInt();
        System.out.println("Enter the number b: ");
        b = input.nextInt();
        System.out.println("Enter the number c: ");
        c = input.nextInt();
        System.out.println("Enter the number d: ");
        d = input.nextInt();
        if (a % 3 ==0) {
            System.out.println("The number " + a + " divide on 3 without remainder");
        }
        if (a % 5 ==0) {
            System.out.println("The number " + a + " divide on 5 without remainder");
        }
        if (b % 3 ==0) {
            System.out.println("The number " + b + " divide on 3 without remainder");
        }
        if (b % 5 ==0) {
            System.out.println("The number " + b + " divide on 5 without remainder");
        }
        if (c % 3 ==0) {
            System.out.println("The number " + c + " divide on 3 without remainder");
        }
        if (c % 5 ==0) {
            System.out.println("The number " + c + " divide on 5 without remainder");
        }
        if (d % 3 ==0) {
            System.out.println("The number " + d + " divide on 3 without remainder");
        }
        if (d % 5 ==0) {
            System.out.println("The number " + d + " divide on 5 without remainder");
        }
}

    public void task2(){
        String test;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data: ");
        test = input.next();
        Pattern pattern = Pattern.compile("[.a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(test);
        if (matcher.matches()){
            System.out.println("The entered data contained special characters");
        }
            System.out.println("The entered data doesn't contained special characters");
    }

    public void task3(){
        int year;

        String answerYear;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
        {
            System.out.println("The year is leap");
        }
        else{
            System.out.println("The year is usual");
        }
        }


    public void task4(){

        String monthName = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of month: ");
        monthName = input.next();

        switch(monthName){
            case "December":
            case "January":
            case "February":
                System.out.println("The season is Winter");
                break;
            case "March":
            case "May":
            case "April":
                System.out.println("The season is Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("The season is Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("The season is Autumn");
                break;
                default:
                System.out.println("Incorrect data");
        }
    }

    public void task5(){
        int lengthColor;
        String colorName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of color: ");
        colorName = input.next();

        switch (colorName) {
            case "red":
                lengthColor = 3;
                break;
            case "blue":
            case "pink":
                lengthColor = 4;
                break;
            case "green":
            case "white":
            case "black":
                lengthColor = 5;
                break;
            case "yellow":
            case "orange":
                lengthColor = 6;
                break;
            default:
                lengthColor = 0;
        }
        System.out.println("Length of word is " + lengthColor);
    }
}

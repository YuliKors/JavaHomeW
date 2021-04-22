import com.sun.prism.shader.Solid_ImagePattern_Loader;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
public class HW2 {
        public void task1() {
            double a = 15.3 / 3;
            System.out.println(a);
        }

    public void task2() {
        double cylinderRadius;
        double cylinderHeight;
        double cylinderVolume;

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder: ");
        cylinderRadius = input.nextInt();
        System.out.println("Enter the height of a cylinder: ");
        cylinderHeight = input.nextInt();
        cylinderVolume = (Math.PI * cylinderRadius * cylinderHeight);
        System.out.println("The volume is: " + cylinderVolume);
    }

    public void task3() {
        Scanner input  = new Scanner(System.in);
        String hexNumber;
        System.out.println("Enter the hex number: ");
        hexNumber = input.next().toUpperCase();
        System.out.println(Integer.parseInt(hexNumber, 16));
    }

//доразобраться
    public void task4() {
        int a = 7;
        System.out.println(a++ + 5*a++ - ++a - 2*a-- + --a);
        System.out.println(a);
    }

    public void task5() {
        Scanner input  = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value a: ");
        a = input.nextInt();
        System.out.println("Enter the value b: ");
        b = input.nextInt();
        c = input.nextInt();
        System.out.println("The pow value x1: " +Math.pow(a,c));
        System.out.println("The pow value x2: " +Math.pow(b,c));

    }
    }

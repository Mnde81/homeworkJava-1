
package lt.vcd3;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);


        System.out.println("Hello ");
        System.out.println("Please enter upper-left corner x1 value: ");

        int x1 = in.nextInt();

        System.out.println("Please enter upper-left corner y1 value: ");

        int y1 = in.nextInt();

        System.out.println("Please enter lower-right corner x2 value: ");

        int x2 = in.nextInt();

        System.out.println("Please enter lower-right corner y2 value: ");

        int y2 = in.nextInt();


        int s = Math.abs(x1-y1) * Math.abs(x2-y2);

        int p = (Math.abs(x1-y1) + Math.abs(x2-y2)) * 2;


        System.out.println("Rectangle area: " + s);
        System.out.println("Rectangle perimeter: " + p);

    }
}


package lt.vcd4;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);


        System.out.println("Hello ");
        System.out.println("Please enter first value a of a triangle side : ");

        int a = in.nextInt();

        System.out.println("Please enter second value b of a triangle side : ");

        int b = in.nextInt();

        System.out.println("Please enter second value c of a triangle side : ");

        int c = in.nextInt();


        float s = (a+b+c) / 2;

        float area = (float)Math.sqrt(s * (s-a) * (s-b) * (s-c));


        System.out.println("Triangle area: " + area);


    }
}


package lt.vcd2;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);


        System.out.println("Hello ");
        System.out.println("Please enter the lenght of a room l value: ");

        int l = in.nextInt();

        System.out.println("Please enter the width of a room w value: ");

        int w = in.nextInt();

        System.out.println("Please enter the price of tiles p value: ");

        float p = in.nextFloat();

        float a = l*w;

        float d = a / 100 * 5;

        float m = ( a + d) * p;

        System.out.println("The total amount required for purchasing the tiles: ");
        System.out.println( m );

    }
}

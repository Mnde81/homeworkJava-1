
package lt.vcd;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);


        System.out.println("Hello ");
        System.out.println("Please enter average number of books read per month v value: ");

        int v = in.nextInt();

        System.out.println("Please enter average number of visitors per year n value: ");

        int n = in.nextInt();

        int k = v * 12 / n;

        System.out.println("The average number of books are read by one visitor per year: ");
        System.out.println( k );

    }
}

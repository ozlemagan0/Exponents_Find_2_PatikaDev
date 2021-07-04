import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        a = sc.nextInt();

        for(int i=1; i<=a; i*=4)
        {
            System.out.println("4 Exponents: "+i);
        }
        for(int k=1; k<=a; k*=5)
        {
            System.out.println("5 Exponents: "+k);
        }
    }
}

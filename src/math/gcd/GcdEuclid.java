package math.gcd;

import java.util.Scanner;

public class GcdEuclid {
    static int gcd(int a, int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("gcd of ("+a+","+b+"): "+gcd(a,b));
    }
}

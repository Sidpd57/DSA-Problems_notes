package math.gcd;

import java.util.Scanner;

public class GcdEffecient {
    static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a!=0)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("gcd of ("+a+","+b+"): "+gcd(a,b));
    }
}

package math.gcd;

import java.util.Scanner;

public class GcdBruteforce {
    static int gcd(int a, int b){
        for(int i = Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("gcd of ("+a+","+b+"): "+gcd(a,b));
    }
}

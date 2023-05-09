package math.prime;

import java.util.Scanner;

public class Efficient {
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        if(isPrime(a))
            System.out.println("prime no.");
        else
            System.out.println("not a prime no.");
    }
}

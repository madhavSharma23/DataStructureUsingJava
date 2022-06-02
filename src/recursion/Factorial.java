package recursion;

import java.util.Scanner;

public class Factorial {
    public static int factRecursive(int n){
        if(n==0 || n==1){
            return n;
        }
        if(n < 0){
            return -1;
        }
        return n*factRecursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial :");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is : "+factRecursive(n));
    }
}

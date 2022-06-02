package recursion;

import java.util.Scanner;

public class Factorial {
    //method to return factorial of a given number using recursion
    public static int factRecursive(int n){
        //base condition
        if(n==0 || n==1){
            return n;
        }
        //additional condition
        if(n < 0){
            return -1;
        }
        //recursive leap of faith
        return n*factRecursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial :");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is : "+factRecursive(n));
    }
}

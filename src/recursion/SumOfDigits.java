package recursion;

public class SumOfDigits {
    public static int sumOfDigitsRecursive(int number){
        if(number<0){
            return -1;
        }
        if(number<=9){
            return number;
        }
        return number%10 + sumOfDigitsRecursive(number/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsRecursive(22));
    }
}

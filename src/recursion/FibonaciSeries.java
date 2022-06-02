package recursion;

public class FibonaciSeries {
    public static int fibRecursive(int n){
        if(n==1 || n== 2){
            return 1;
        }
        if(n<0){
            return -1;
        }
        return fibRecursive(n-1)+fibRecursive(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibRecursive(5));
    }
}

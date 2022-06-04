package recursion;

public class PowerOfNumber {
    public static int powRecursive(int base,int exponent){
        if(exponent<0){
            return -1;
        }
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return  base;
        }
        return base * powRecursive(base,exponent-1);
    }
    public static void main(String[] args) {
        System.out.println(powRecursive(3,0));
    }
}

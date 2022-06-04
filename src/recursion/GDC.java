package recursion;

public class GDC {
    public static int gdcRecursive(int num1, int num2) {
        if(num2 ==1 || num1 == 1){
            return 1;
        }else if( num2 == num1 || num2%num1 == 0){
            return num1;
        }
        return gdcRecursive(num2%num1,num1);
    }
    public static void main(String[] args) {
        System.out.println(gdcRecursive(24,12));
    }
}

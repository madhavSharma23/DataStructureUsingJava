package recursion;

public class TableRecursive {
    public static void tableRecursive(int n,int count){
        if(count<=0){
            return;
        }
        tableRecursive(n,count-1);
        System.out.println(n+" x "+count+" = "+n*count);
    }
    public static void main(String[] args) {
        tableRecursive(2,10);
    }
}

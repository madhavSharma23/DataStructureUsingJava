package recursion;

public class ProductOfArray {
    public static int productOfArray(int[] arr,int len){
        if(len == 0){
            return arr[len];
        }else{
            return arr[len-1]*productOfArray(arr,len-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(productOfArray(arr,6));
    }
}

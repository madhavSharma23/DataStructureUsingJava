package recursion;

public class DecimalToBinary {
    public static void decToBin(int dec) {
        if(dec < 0){
            System.out.println("Enter positive numbers only");
            return;
        }
        if(dec == 0){
            System.out.print(0);
            return;
        }
        decToBin(dec/2);
        System.out.print(dec%2);
    }

    public static void main(String[] args) {
        decToBin(-42);
    }
}

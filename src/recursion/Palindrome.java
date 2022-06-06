package recursion;

public class Palindrome {
    public static String reverse(String str){
        if(str == null || str.length() <1){
            return "";
        }
        return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
    }
    public static boolean isPalindrome(String str){
        String rev = reverse(str);
        return rev.equals(str);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(reverse("abba"));
    }
}

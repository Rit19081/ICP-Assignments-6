package Assignment_6;

public class Q8 {
    public static boolean palindrome(String str){
        char []a = str.toCharArray();
        int l = a.length - 1;
        String b = "";
        for(int i = l ; i>=0 ; i--){
            b=b+a[i];
        }
        return str.equals(b);

    }
    public static void main(String [] args) {
        System.out.println(palindrome("house"));

    }
}

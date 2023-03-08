package Assignment_6;
import java.util.Scanner;
public class HA_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.next();
        int l = str.length();
        int mid1 = (l/2);
        System.out.println("The middle character in the string: " + str.charAt(mid1));

    }
}

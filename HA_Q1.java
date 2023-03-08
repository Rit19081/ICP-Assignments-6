package Assignment_6;

import java.util.Scanner;
public class HA_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int l = str.length();
        for (int i = 0; i<l; i++){
            int sum = 0;
            char ch1 = str.charAt(i);
            for(int j = 0 ; j<l ; j++){
                char ch2 =  str.charAt(j);
                if (ch1 == ch2){
                    sum=sum+1;
                }
            }
            if (sum == 1){
                System.out.println("The non repeated letter is " + ch1);
                break;
            }
        }

    }
}

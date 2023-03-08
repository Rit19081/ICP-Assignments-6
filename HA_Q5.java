package Assignment_6;

public class HA_Q5 {
    public static boolean ConsecutiveChecking(int a, int b, int c){
        return b == ++a && c == ++a;
    }

    public static void main(String[] args) {
        System.out.println(ConsecutiveChecking(4,5,6));
    }
}

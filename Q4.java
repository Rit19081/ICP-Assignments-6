package Assignment_6;

public class Q4 {
    public static int numberOfDaysInAYear(int n) {
        if ((n%4 ==  0 && n%100 != 0) || n%400 == 0)
            return 366;
        else
            return 365;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i=2000 ; i<=2020 ; i++) {
            sum = sum + numberOfDaysInAYear(i);
        }
        System.out.println("The number days between 2000 to 2020: " + sum);

    }

}
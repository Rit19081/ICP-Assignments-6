package Assignment_6;

public class Q10 {
    public static class area{
        static double triangle(double a, double b, double c){
            double s = (a+b+c)/2;
            System.out.print("Area of the Triangle:");
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        static double rectangle(double a, double b){
            System.out.print("Area of the rectangle:");
            return a*b;
        }
        static double circle(double a){
            System.out.print("Area of the circle:");
            return Math.PI*a*a;
        }
        static double square(double a){
            System.out.print("Area of the Square:");
            return a*a;
        }


    }
    public static void main(String[] args) {
        System.out.println(area.triangle(3,4,5));
        System.out.println(area.square(3));
        System.out.println(area.circle(1));
        System.out.println(area.rectangle(3,4));

    }
}

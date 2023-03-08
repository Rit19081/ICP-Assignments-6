package Assignment_6;

public class HA_Q2 {
    public static class volume{
        static double cube(double s){
            return s*s*s;
        }
        static double sphere(double r){
            return (4.0/3.0)*Math.PI*r*r*r;
        }
        static double cuboid(double l,double b,double h){
            return l*b*h;
        }
    }
    public static void main(String[] args) {
        System.out.println(volume.cube(3));
        System.out.println(volume.sphere(5));
        System.out.println(volume.cuboid(4,5,6));

    }
}

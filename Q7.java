package Assignment_6;

public class Q7 {
    public static int count(String str){
        char []arr = str.toCharArray();
        int sum=0;
        for (int i=0; i<arr.length;i++){
            char l = arr[i];
            if (l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
                sum=sum+1;
        }
        return sum;
    }
    public static void main(String [] args){
        System.out.print(count("Welcome"));

    }
}

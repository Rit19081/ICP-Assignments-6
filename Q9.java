package Assignment_6;

public class Q9 {
    public static String PasswordChecking(String str){
        char []chars={'~','`','!','@','#','$','%','^','&','*','_','-','+','=','|',':','<','>','?','.'};
        char []arr = str.toCharArray();
        int sum2=0,sum3=0;
        for(int i=0 ; i< arr.length ; i++){
            char a = arr[i];
            for(char num = 48 ; num<=57 ; num++){
                if (num == a)
                    sum2=sum2+1;
            }
            for(int j = 0 ; j< chars.length ; j++){
                if (a == chars[j])
                    sum3=sum3+1;
            }
        }
        if (arr.length < 8)
            return "Invalid Password";
        else if (sum2 < 2 || sum3>0)
            return "Invalid Password";
        else
            return "Valid Password";
    }
    public static void main(String[] args) {
        System.out.println(PasswordChecking("Ritha#12"));

    }
}

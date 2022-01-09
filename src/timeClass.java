import java.math.BigInteger;

public class timeClass {
    public static void main(String[] args){
        int a = 0;
        for(int i=0; i<=1000000000; i++){
            a = a+i;
        }
        System.out.println(a*4);
    }
}

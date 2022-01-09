public class addTwoNumbers {
    public static void main(String[] args){
        int a,b,sum;
        a = 29;
        b = 30;
        sum = a+b;
        System.out.println(sum);
        int one,two,three,largeNo;
        one = 23;
        two = 3;
        three = 199;
        if(one>two){
            if(one>three){
                System.out.println("Largest Number: "+one);
            }
            else{
                System.out.println("Largest Number: "+three);
            }
        }
        else{
            if (two>three){
                System.out.println("Largest Number: "+two);
            }
            else{
                System.out.println("Largest Number: "+three);
            }
        }
    }
}

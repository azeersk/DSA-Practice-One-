class primeNumber{
    public static void primeCheck(int input){
        int i,count;
        count = 0;
        for(i=2; i<input; i++){
            if (input%i==0){
                count = count+1;
            }
        }
        if(count==0){
            System.out.println(input +" is Prime number.");
        }
        else{
            System.out.println(input+" is not Prime number.");
        }
    }
}

class fibonacciSeries{
    public void fibonacci(int fibo){
        int first,second,i,finalF;
        first =0;
        second = 1;
        finalF = 0;
        System.out.println(first);
        System.out.println(second);
        for(i=2; i<=14; i++){
            finalF = second;
            second = second + first;
            first = finalF;
            System.out.println(second);
        }
    }
}
public class factorialNumber {
    public static void main(String[] args){

        int a,i,fact;
        a = 4;
        fact = 1;
        for(i=1; i<=a; i++){
            fact = fact*i;
        }
        System.out.println("Factorial: "+ fact);
        primeNumber objPrime = new primeNumber();
        objPrime.primeCheck(992);
        fibonacciSeries objFibo = new fibonacciSeries();
        objFibo.fibonacci(3);

    }
}

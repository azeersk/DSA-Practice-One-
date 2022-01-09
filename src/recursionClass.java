class New{
    public static int recursionOf(int a){
        if(a!=0){
            return a*recursionOf(a-1);
        }
        else
            return 1;
    }
}

public class recursionClass {
    public static void main(String[] args){
        New objRecurs = new New();
        int result = objRecurs.recursionOf(4);
        System.out.println("Recursion is: "+result);
    }
}

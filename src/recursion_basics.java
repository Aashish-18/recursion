import java.sql.SQLOutput;

public class recursion_basics {
    public static void main(String args[]){
        // print number from 1 to 5 by calling a single function without loop
        System.out.print(fibonacci(6));
    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }

       return fibonacci(n-1)+fibonacci(n-2);
    }

}

import java.util.*;
public class Multiple_recursion {

        static int f(int n) {
            if(n<=1){
                return n;
            }
            int start=f(n-1);
            int last=f(n-2);
            return start+last;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(f(a));
        }
    }


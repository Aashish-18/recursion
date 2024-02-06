public class reverse_number_recursion {
    public static void main(String args[]){
        int n=4508;
        System.out.println(reverse(n,0));
        System.out.println(reverse2(n));

        System.out.println(palindrome(999));
    }
    // first method
    static int reverse(int n, int reversed){
        if(n == 0)
            return reversed;
        int rem = n % 10;
        reversed = reversed * 10 + rem;
        return reverse(n / 10, reversed);
    }
    //2nd method
    static int reverse2(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n) return n;
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return n==reverse2(n);
    }
}

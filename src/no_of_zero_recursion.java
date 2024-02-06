public class no_of_zero_recursion {
    public static void main(String args[]){
        int n = 890032;
        System.out.println(zero(n));
    }

    static int zero(int n){
        return helper(n);
    }

    static int helper(int n){
        if(n == 0) // Base case: if n becomes 0, return 0
            return 0;

        int rem = n % 10;
        if(rem == 0)
            return 1 + helper(n / 10); // Increment count if rem is 0 and continue recursion
        else
            return helper(n / 10); // Otherwise, continue recursion without incrementing count
    }
}

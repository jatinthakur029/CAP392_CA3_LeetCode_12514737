class Solution {
    public int fib(int n) {
        if(n == 0)return 0;
        if(n==1)return 1;
        int fib_num = 0;
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            fib_num = a + b;
            a = b;
            b= fib_num;            
        }
        return fib_num;
    }
}

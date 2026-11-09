class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n > 0){
            int ldigit = n % 10;
            sum = sum + ldigit;
            mul = mul * ldigit;
            n = n / 10;
        }
        return mul - sum;
    }
}
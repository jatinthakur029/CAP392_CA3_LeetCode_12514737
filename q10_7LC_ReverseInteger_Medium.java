class Solution {
    public int reverse(int x) {
       long rev_num = 0;
        
        while(x != 0){
            int ldigit = x % 10;          
            rev_num = rev_num * 10 + ldigit;
            x = x / 10;
        }
         if (rev_num > Integer.MAX_VALUE || rev_num < Integer.MIN_VALUE) {
            return 0;
        }
        else{
            return (int)rev_num;
        }
    }
}
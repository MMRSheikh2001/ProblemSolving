public class TribonacciNumber1137 {
    public static void main(String[] args) {

        Solution solution=new Solution();
        System.out.println(solution.tribonacci(4));
        System.out.println(solution.tribonacci(25));
    }
}

class Solution {
    public int tribonacci(int n) {
        int i = 0;
        int j = 1;
        int k = 1;
        int l = i + j + k;
        if (n == 0) {
            return i;
        } else if (n == 1) {
            return j;

        } else if (n == 2) {
            return k;

        } else {
            for (int c = 3; c <= n; c++) {
                l = i + j + k;
                i=j;
                j=k;
                k=l;
              
            }
        }
        return l;
    }
}
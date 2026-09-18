public class GuessNumber374 {
    public static void main(String[] args) {
        
    }
}

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=0;
        while(start<=n){
            int mid=(start+n)/2;
            if(guess(mid)==-1){
                start=mid+1;
            }else if(guess(mid)==1){
                n=mid-1;
            }else if(guess(mid)==0){
                return mid;
            }

        }
        return 0;
    }
}
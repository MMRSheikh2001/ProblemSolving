public class AccountBalanceAfterRoundedPurchage2806 {
    public static void main(String[] args) {

    }

}

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        int remain = purchaseAmount % 10;

        if (remain < 5) {
            purchaseAmount = purchaseAmount - remain;
        } else {
            purchaseAmount = purchaseAmount - remain + 10;
        }

        return 100 - purchaseAmount;

    }
}
public class CalculateMoneyLeetCodeBank1716 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;

        int extraDay = n % 7;
        int totalWeek = (n - extraDay) / 7;
        int firstDay = 1;

        for (int i = 1; i <= totalWeek; i++) {
            totalMoney += (firstDay + firstDay + 1 + firstDay + 2 + firstDay + 3 + firstDay + 4 + firstDay + 5
                    + firstDay + 6);
            firstDay++;
        }
        for (int i = 0; i < extraDay; i++) {
            totalMoney += (firstDay + i);

        }

        return totalMoney;

    }
}
public class TotalDistanceTraveled2739 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int totalDistance = 0;

        while (mainTank != 0) {
            if (mainTank >= 5) {
                totalDistance = totalDistance + (5 * 10);
                mainTank = mainTank - 5;
                if (additionalTank > 0) {
                    additionalTank--;
                    mainTank++;

                }
            } else {
                totalDistance = totalDistance + (mainTank * 10);
                mainTank = 0;
            }

        }

        return totalDistance;

    }
}
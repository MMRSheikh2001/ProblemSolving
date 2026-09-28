import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountDaysSpentTogether2409 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        

        arriveAlice = "2003-" + arriveAlice;
        leaveAlice = "2003-" + leaveAlice;
        arriveBob = "2003-" + arriveBob;
        leaveBob = "2003-" + leaveBob;

        LocalDate arrAliceDate = LocalDate.parse(arriveAlice);
        LocalDate leaAliceDate = LocalDate.parse(leaveAlice);

        LocalDate arrBodDate = LocalDate.parse(arriveBob);
        LocalDate leaBobDate = LocalDate.parse(leaveBob);

        if (arrAliceDate.isBefore(arrBodDate)) {
            arrAliceDate = arrBodDate;

        }
        if (leaAliceDate.isAfter(leaBobDate)) {
            leaAliceDate = leaBobDate;
        }

        return (int) ChronoUnit.DAYS.between(arrAliceDate, leaAliceDate) + 1;

    }
}
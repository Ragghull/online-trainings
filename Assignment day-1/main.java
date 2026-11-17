
import java.util.*;

public class main {

    public static void main(String[] args) {

        int[] attendance = {
            45, 42, 48, 40, 50,
            46, 49, 43, 47, 44
        };

        int[] runningTotal =
                new int[attendance.length + 1];

        runningTotal[0] = 0;

        for (int i = 1; i <= attendance.length; i++) {

            runningTotal[i] =
                    runningTotal[i - 1] + attendance[i - 1];
        }

        System.out.println("Attendance: "
                + Arrays.toString(attendance));

        System.out.println("Running Total: "
                + Arrays.toString(runningTotal));

        
        int startDay = 3;
        int endDay = 7;

        if (startDay >= 1 &&
            endDay <= attendance.length &&
            startDay <= endDay) {

            int total = runningTotal[endDay]
                    - runningTotal[startDay - 1];

            System.out.println("Total attendance from Day "
                    + startDay + " to Day " + endDay
                    + " = " + total);

        } else {
            System.out.println("Invalid range");
        }

        int maxAttendance = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < attendance.length; i++) {

            if (attendance[i] > maxAttendance) {

                maxAttendance = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: "
                + maxAttendance);

        System.out.println("Highest attendance is on Day "
                + maxDay);
    }
}

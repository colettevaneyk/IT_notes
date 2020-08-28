import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StopWatch {
    public static long startTime_A = 0L;
    public static long startTime_B = 0;
    public static long startTime_C = 0;

    public static long endTime_A = 0;
    public static long endTime_B = 0;
    public static long endTime_C = 0;

    public static long deltaTime_A = 0;
    public static long deltaTime_B = 0;
    public static long deltaTime_C = 0;

    public static long startTimer(int timer) {
        long getTime = System.nanoTime();
        if (timer == 0) {
            startTime_A = getTime;
        } else if (timer == 1) {
            startTime_B = getTime;
        } else if (timer == 2) {
            startTime_C = getTime;
        }
        return getTime;
    }

    public static long stopTimer(int timer) {
        long getTime = System.nanoTime();
        if (timer == 0) {
            endTime_A = getTime;
        } else if (timer == 1) {
            endTime_B = getTime;
        } else if (timer == 2) {
            endTime_C = getTime;
        }
        return getTime;
    }

    public static String getTimer(int timer, String unit) {
        double delta_value = 0;
        String unitname = "";
        if (timer == 0) {
            deltaTime_A = endTime_A - startTime_A;
            delta_value = deltaTime_A;
        } else if (timer == 1) {
            deltaTime_B = endTime_B - startTime_B;
            delta_value = deltaTime_B;

        } else if (timer == 2) {
            deltaTime_C = endTime_C - startTime_C;
            delta_value = deltaTime_C;
        }
        // use the variable defined as <unit> to change and set variables
        if (unit.equals("ns")) {
            unitname = " ns";
        } else if (unit.equals("us")) {
            delta_value = delta_value / 1000L;
            unitname = " us";
        } else if (unit.equals("ms")) {
            delta_value = delta_value / 1000000L;
            unitname = " ms";
        } else if (unit.equals("s")) {
            delta_value = delta_value / 1000000000L;
            unitname = " s";
        }
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        var print_time = df.format(delta_value);
        return print_time + unitname;
    }

    public static void main(String[] args) {
        // startTimer(0);
        // startTimer(1);
        // startTimer(2);
        // try {
        //     Thread.sleep(500);
        // } catch (Exception e) {
        //     Printerm.singleline("!E! <Tread.sleep()>");
        // }
        // stopTimer(0);
        // try {
        //     Thread.sleep(500);
        // } catch (Exception e) {
        //     Printerm.singleline("!E! <Tread.sleep()>");
        // }
        // stopTimer(1);
        // try {
        //     Thread.sleep(500);
        // } catch (Exception e) {
        //     Printerm.singleline("!E! <Tread.sleep()>");
        // }
        // stopTimer(2);
        // Printerm.singleline(getTimer(0, "ns"));
        // Printerm.singleline(getTimer(0, "us"));
        // Printerm.singleline(getTimer(0, "ms"));
        // Printerm.singleline(getTimer(0, "s"));
        // Printerm.singleline(getTimer(1, "ns"));
        // Printerm.singleline(getTimer(1, "us"));
        // Printerm.singleline(getTimer(1, "ms"));
        // Printerm.singleline(getTimer(1, "s"));
        // Printerm.singleline(getTimer(2, "ns"));
        // Printerm.singleline(getTimer(2, "us"));
        // Printerm.singleline(getTimer(2, "ms"));
        // Printerm.singleline(getTimer(2, "s"));

    }
}
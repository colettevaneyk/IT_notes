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

    public static long setStartTimer(int timer) {
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

    public static long setEndTimer(int timer) {
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

    public static String getDeltaTimer(int timer, int unit) {
        long delta_value = 0;
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

        if (unit == 0) {
            unitname = " ns";
        } else if (unit == 1) {
            delta_value = delta_value / 1000L;
            unitname = " us";
        } else if (unit == 2) {
            delta_value = delta_value / 1000000L;
            unitname = " ms";
        } else if (unit == 3) {
            delta_value = delta_value / 1000000000L;
            unitname = "s";
        }
        return Long.toString(delta_value) + unitname;
    }

    public static void main(String[] args) {
        setStartTimer(0);
        setStartTimer(1);
        setStartTimer(2);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            Printerm.singleline("!E! <Tread.sleep()>");
        }
        setEndTimer(0);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            Printerm.singleline("!E! <Tread.sleep()>");
        }
        setEndTimer(1);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            Printerm.singleline("!E! <Tread.sleep()>");
        }
        setEndTimer(2);
        Printerm.singleline(getDeltaTimer(0, 0));
        Printerm.singleline(getDeltaTimer(0, 1));
        Printerm.singleline(getDeltaTimer(0, 2));
        Printerm.singleline(getDeltaTimer(1, 0));
        Printerm.singleline(getDeltaTimer(1, 1));
        Printerm.singleline(getDeltaTimer(1, 2));
        Printerm.singleline(getDeltaTimer(2, 0));
        Printerm.singleline(getDeltaTimer(2, 1));
        Printerm.singleline(getDeltaTimer(2, 2));
    


    }
}
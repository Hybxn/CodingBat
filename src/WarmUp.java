public class WarmUp {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static int diff21(int n) {
        if (n < 21)
            return Math.abs(21 - n);
        return Math.abs(n - 21) * 2;
    }

    public static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10
                || Math.abs(100 - n) <= 10
                || Math.abs(n - 200) <= 10
                || Math.abs(200 - n) <= 10);
    }

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public static boolean startHi(String str) {
        if (str.length() < 2)
            return false;
        return str.toLowerCase().substring(0, 2).contains("hi");
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);
    }

    public static boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        return ((str.charAt(1) == 'i' || str.charAt(1) == 'I')
                && (str.charAt(2) == 'x' || str.charAt(2) == 'X'));
    }

    public static int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b))
            return b;
        else if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        return 0;
    }

    public static boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
            return true;
        return (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile)
            return true;
        return (aSmile && bSmile);
    }

    public static int sumDouble(int a, int b) {
        if (a == b)
            return 2 * (a + b);
        return a + b;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && !(hour >= 7 && hour <= 20);
    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative)
            return a < 0 && b < 0;
        return ((a < 0 && b >= 0) || (a >= 0 &&  b < 0));
    }
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0,3).equalsIgnoreCase("not"))
            return str;
        return "Not " + str;
    }


}

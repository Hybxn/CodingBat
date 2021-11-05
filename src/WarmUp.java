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
        return ((a < 0 && b >= 0) || (a >= 0 && b < 0));
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equalsIgnoreCase("not"))
            return str;
        return "Not " + str;
    }

    public static String frontBack(String str) {
        if (str.length() < 2)
            return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static String front3(String str) {
        if (str.length() < 3)
            return str + str + str;
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    public static boolean or35(int n) {
        return ((n % 3) == 0) || ((n % 5) == 0);
    }

    public static String front22(String str) {
        if (str.length() < 3)
            return str + str + str;
        return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19 && !(b >= 13 && b <= 19)) || (b >= 13 && b <= 19 && !(a >= 13 && a <= 19));
    }

    public static String delDel(String str) {
        if (str.length() < 4)
            return str;
        if (str.substring(1, 4).equalsIgnoreCase("del"))
            return str.charAt(0) + str.substring(4);
        return str;
    }

    public static String startOzMal(String str) {
        if (str.length() != 0) {
            final boolean b = str.charAt(0) == 'o' || str.charAt(0) == 'O';
            if (str.length() == 1 && b) {
                return String.valueOf(str.charAt(0));
            } else {
                final boolean b1 = str.charAt(1) == 'z' || str.charAt(1) == 'Z';
                if (b1 && b)
                    return String.valueOf(str.charAt(0)) + str.charAt(1);
                else if (b1)
                    return String.valueOf(str.charAt(1));
                else if (b)
                    return String.valueOf(str.charAt(0));
            }
        }
        return "";
    }

    public static int intMax(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static boolean stringE(String str) {
        int totalE = 0;
        char[] letras = str.toCharArray();
        for (char c : letras) {
            if (c == 'e' || c == 'E')
                totalE++;
        }
        return (totalE >= 1 && totalE <= 3);
    }

    public static boolean lastDigit(int a, int b) {
        if (a < 10 && b < 10)
            return a == b;
        if (a < 10 && b > 10)
            return a == b % 10;
        if (a > 10 && b < 10)
            return a % 10 == b;
        return a % 10 == b % 10;
    }

    public static String endUp(String str) {
        if (str.length() < 3)
            return str.toUpperCase();
        return str.substring(0, str.length() - 3)
                + str.substring(str.length() - 3).toUpperCase();
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public static String everyNth(String str, int n) {
        return "";
    }



}

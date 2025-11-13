/*
 * Originally created: 11/13/2025
 * Version: 1.0.0
 */

public class stringDemo02 {
    public static void main() {
        String demoString = "-Hello Jeremiah!-";
        StringBuffer demoStringBuffer = new StringBuffer(demoString);
        printStringBuffer(demoStringBuffer);

        demoStringBuffer.append(" more text");
        printStringBuffer(demoStringBuffer);

        demoStringBuffer.setCharAt(0, '~');
        printStringBuffer(demoStringBuffer);
    }

    public static void printStringBuffer(StringBuffer str) {
        System.out.println("demoStringBuffer = " + str);
    }
}

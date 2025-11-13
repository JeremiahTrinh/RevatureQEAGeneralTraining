/*
* Originally created: 11/13/2025
* Version: 1.0.0
*/

public class stringDemo01{
    public static void main(String []args){
        String demoString = "-Hello Jeremiah!-";

        System.out.println(demoString.toLowerCase());
        System.out.println(demoString.toUpperCase());
        System.out.println(demoString.length());
        System.out.println(demoString.replace('l', 'p'));
        System.out.println("\t\t\t".concat(demoString) + "\t\t\t");
        System.out.println("\t\t\t".concat(demoString).concat("\t\t\t").equals("\t\t\t-Hello Jeremiah!-\t\t\t"));
        System.out.println(demoString.equalsIgnoreCase("-hello jeremiah!-"));
        System.out.println("\t\t \t".concat(demoString).concat("\t \t \t").trim());
    }
}
package strings_examples;

public class StringLength {
    public static void main(String[] args) {
        /*
        * A String in Java is actually an object, which contain methods that can perform certain operations on strings.
        * For example, the length of a string can be found with the length() method
        */

        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The lenght of the txt string is: " + txt.length());
        System.out.println("**************************************************");

        /**
         * here are many string methods available, for example toUpperCase() and toLowerCase():
         */


        String letterUpper = txt.toUpperCase();
        String letterLower = letterUpper.toLowerCase();

        System.out.println(letterLower);
        System.out.println(letterUpper);
    }
}

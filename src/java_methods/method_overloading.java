package java_methods;

public class method_overloading {
    /**
     * With method overloading, multiple methods can have the same name with different parameters:
     *
     * Example:
     * int myMethod(int x)
     * float myMethod(float x)
     * double myMethod(double x, double y)
     */

    //the following example, which have two methods that add numbers of different type:

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myDouble = plusMethod(4.3, 6.26);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myDouble);
    }
}

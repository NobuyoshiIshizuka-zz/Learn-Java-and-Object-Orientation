package java_methods;

public class MethodsWithArguments {
    /**
     * Information can be passed to methods as parameter. Parameters act as variables inside the method.
     */

    static void myMethod(String fName, int age){
        System.out.println(fName + " is" + age);
    }

    //Return Values:

    static int myInt(int x, int y){
        return 5 + x;
    }

    public static void main(String[] args) {
        myMethod("Nobuyoshi", 32);
        myMethod("Jenny", 15);
        myMethod("Anja", 20);

        System.out.println("Putting the value 5 as an argument: " + myInt(5, 3));

        //You can also store the result in a variable (recommended, as it is easier to read and maintain):
        int result = myInt(5, 3);
        System.out.println(result);
    }
}

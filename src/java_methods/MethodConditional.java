package java_methods;

public class MethodConditional {
    //It is common to use if...else statements inside methods:

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Acces denied - You are not old enough");
        } else
            System.out.println("Access granted - You are old enough!");
    }

    public static void main(String[] args) {
        checkAge(20);
    }

}

package math;


public class MathRandom {
    public static void main(String[] args) {
        /**
         * Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
         * */
        System.out.println(Math.random());

        //To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:
        int randomNum = (int)(Math.random() * 101);

        System.out.println(randomNum);
    }
}

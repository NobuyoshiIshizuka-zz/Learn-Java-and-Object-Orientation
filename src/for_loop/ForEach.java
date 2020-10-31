package for_loop;
/**
 * There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
 * */

public class ForEach {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }
    }
}

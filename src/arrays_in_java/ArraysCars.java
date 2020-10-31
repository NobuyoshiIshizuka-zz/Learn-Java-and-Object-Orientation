package arrays_in_java;

public class ArraysCars {
    public static void main(String[] args) {
        String cars[] = {"Volvo", "BMW", "Ford", "Toyota"};
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};

        for (String i : cars){
            System.out.println(i);
    }
        for (int i : numeros){
            System.out.println(i);
        }

        System.out.println();
        //Acces the Elements of an Array
        //Você acessa um elemento de matriz referindo-se ao número do índice.
        System.out.println(cars[0]);
        System.out.println(cars[3]);
        System.out.println();

        /**
         * Change an Array Element
         * To change the value of a specific element, refer to the index number:
         */

        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println();


        /**
         * To find our how many elements an array has, use the lenght property:
         */

        System.out.println("Elements in array cars: " + cars.length);
        System.out.println();

        /**
         * You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.
         */

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}

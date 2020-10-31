package arrays_in_java;

public class MultimidimensionalArrays {
    public static void main(String[] args) {
        int [][] myNumbers = {{1,2,3,4}, {5,6,7,8}};

        int x = myNumbers[1][2];
        System.out.println(x);

        for (int i = 0; i < myNumbers.length; ++i){
            for (int j = 0; i < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }

}

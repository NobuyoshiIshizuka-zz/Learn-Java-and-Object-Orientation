package switch_statements;

public class SwichStatements {
    public static void main(String[] args) {
        /**
         * Use the switch statement to select one of many code blocks to be executed.
         * */

        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
        }

    }
}

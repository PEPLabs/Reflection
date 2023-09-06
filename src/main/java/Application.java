import java.util.Arrays;

public class Application {
    /**
     * You may use this main method to manually test your code in any way you like
     * This will not impact test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println("Printing out the Lab class toString:");
        System.out.println(lab.getMyClass());
        System.out.println("Printing out the Lab methods toString:");
        System.out.println(Arrays.toString(lab.getMyMethods()));
        System.out.println("Printing out the Lab class toString:");
        System.out.println(Arrays.toString(lab.getMyFields()));
    }
}

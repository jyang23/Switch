import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String monthNames;
        int days;

        System.out.print("Enter the number of days in a month: ");
        days = Integer.parseInt(keyboard.next());

        switch (days) {
            case 28:  monthNames = "February";
                break;
            case 30:  monthNames = "April June September November";
                break;
            case 31:  monthNames = "January March May July August October December";
                break;
            default: monthNames = "Does not exist";
                break;
        }
        System.out.println(monthNames);
    }
}

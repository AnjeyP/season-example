import java.util.Scanner;

public class SeasonExample {
    public enum Season {AUTUMN, SPRING, SUMMER, WINTER}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter month of the year");
        String month = scanner.next();
        switch ( month ) {
            case "December":
            case "February":
            case "January":
                System.out.println (Season.WINTER);
                break;
            case "March":
            case "April":
            case "May":
                System.out.println (Season.SPRING);
                break;
            case "June":
            case "July":
            case "August":
                System.out.println (Season.SUMMER);
                break;
            case "September":
            case "October":
            case "November":
                System.out.println (Season.AUTUMN);
                break;
            default:
                System.out.println ( "No this month" );
        }
    }
}

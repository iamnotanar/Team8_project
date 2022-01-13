import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Flight> flights  = FileReader.readFlights();
        List<Flight> data = flights;
        List<Flight> output = null;

        while (true) {
            System.out.println("Press 1 for List");
            System.out.println("Press 2 for Sort");
            System.out.println("Press 3 for Search");
            System.out.println("Press 4 for List column names");
            System.out.println("Press 5 for Filter");
            System.out.println("Press 6 for Exit");
            System.out.print("Enter your input to proceed: ");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    ListFunctionality.run(flights);
                    break;

                case 2:
                    SortFunctionality.run(flights);
                    break;

                case 3:
                    SearchFunctionality.run(flights);
                    break;

                case 4:
                    System.out.println("Date, Time, Location, Operator, Flight, Route, Type, Registration, cnIn, Aboard, Fatalities, Ground, Survivors, SurvivalRate, Summary, ClustId");
                    break;

                case 5:
                    FilterFunctionality.run(flights);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid input!");
            }
        }
    }
}

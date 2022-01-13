import java.util.*;

public class ListFunctionality {
    public static void run(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. List all the fields of each entity");
        System.out.println("2. List only the selected fields of each entity");
        System.out.println("3. List entities based on range of rows");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                listAllFields(flights);
                break;

            case 2:
                listOnlySelectedFields(flights);
                break;

            case 3:
                listEntitiesBasedOnRange(flights);
                break;

            default:
                System.out.println("Enter a valid input!");
                break;
        }
    }

    public static void listAllFields(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println(flight);
        }

        System.out.println("Number of entities: " + flights.size());
    }

    public static void listOnlySelectedFields(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fields: ");
        String input = scanner.nextLine();

        for (Flight flight : flights) {
            if (input.contains("date")) {
                System.out.print(flight.getDate() + ", ");
            }

            if (input.contains("time")) {
                System.out.print(flight.getTime() + ", ");
            }

            if (input.contains("location")) {
                System.out.print(flight.getLocation() + ", ");
            }

            if (input.contains("operator")) {
                System.out.print(flight.getOperator() + ", ");
            }

            if (input.contains("flight")) {
                System.out.print(flight.getFlight() + ", ");
            }

            if (input.contains("route")) {
                System.out.print(flight.getRoute() + ", ");
            }

            if (input.contains("type")) {
                System.out.print(flight.getType() + ", ");
            }

            if (input.contains("registration")) {
                System.out.print(flight.getRegistration() + ", ");
            }

            if (input.contains("cnin")) {
                System.out.print(flight.getCnIn() + ", ");
            }

            if (input.contains("aboard")) {
                System.out.print(flight.getAboard() + ", ");
            }

            if (input.contains("fatalities")) {
                System.out.print(flight.getFatalities() + ", ");
            }

            if (input.contains("ground")) {
                System.out.print(flight.getGround() + ", ");
            }

            if (input.contains("survivors")) {
                System.out.print(flight.getSurvivors() + ", ");
            }

            if (input.contains("summary")) {
                System.out.print(flight.getSummary() + ", ");
            }

            if (input.contains("clustid")) {
                System.out.print(flight.getClustId() + ", ");
            }

            System.out.println();
        }

        System.out.println("Number of entities: " + flights.size());
    }

    public static void listEntitiesBasedOnRange(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        for (int i = startIndex - 1; i < endIndex; i++) {
            System.out.println(flights.get(i));
        }
    }
}

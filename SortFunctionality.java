import java.util.*;

public class SortFunctionality {
    public static void run(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);

        List<Flight> list = flights;

        System.out.print("Enter the field: ");
        String field = scanner.next();

        System.out.print("Enter the order (ASC, DESC): ");
        String order = scanner.next();

        switch (field) {
            case "date":
                sort(list, order, Comparator.comparing(Flight::getDate));
                break;

            case "time":
                sort(list, order, Comparator.comparing(Flight::getTime));
                break;

            case "location":
                sort(list, order, Comparator.comparing(Flight::getLocation));
                break;

            case "operator":
                sort(list, order, Comparator.comparing(Flight::getOperator));
                break;

            case "flight":
                sort(list, order, Comparator.comparing(Flight::getFlight));
                break;

            case "route":
                sort(list, order, Comparator.comparing(Flight::getRoute));
                break;

            case "type":
                sort(list, order, Comparator.comparing(Flight::getType));
                break;

            case "registration":
                sort(list, order, Comparator.comparing(Flight::getRegistration));
                break;

            case "cnin":
                sort(list, order, Comparator.comparing(Flight::getCnIn));
                break;

            case "aboard":
                sort(list, order, Comparator.comparing(Flight::getAboard));
                break;

            case "fatalities":
                sort(list, order, Comparator.comparing(Flight::getFatalities));
                break;

            case "ground":
                sort(list, order, Comparator.comparing(Flight::getGround));
                break;

            case "survivors":
                sort(list, order, Comparator.comparing(Flight::getSurvivors));
                break;

            case "survivalrate":
                sort(list, order, Comparator.comparing(Flight::getSurvivalRate));
                break;

            case "summary":
                sort(list, order, Comparator.comparing(Flight::getSummary));
                break;

            case "clustid":
                sort(list, order, Comparator.comparing(Flight::getClustId));
                break;

            default:
                System.out.println("Enter a valid input!");
        }

        ListFunctionality.listAllFields(list);
    }

    private static void sort(List<Flight> flights, String order, Comparator<Flight> comparing) {
        Collections.sort(flights, comparing);

        if (order.equals("DESC")) {
            Collections.reverse(flights);
        }
    }
}

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SearchFunctionality {
    public static void run(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);
        List<Flight> list = new ArrayList<>();

        System.out.print("Enter the field: ");
        String field = scanner.next();

        System.out.print("Enter the value: ");
        String value = scanner.next();

        search(flights, field, value);
    }

    private static void search(List<Flight> flights, String field, String value) {
        List<Flight> result = new ArrayList<>();

        switch (field) {
            case "date":
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
                LocalDate date = LocalDate.parse(value, formatter);

                for (Flight flight : flights) {
                    if (flight.getDate().equals(date)) {
                        result.add(flight);
                    }
                }
                break;

            case "time":
                LocalTime time = LocalTime.parse(value);

                for (Flight flight : flights) {
                    if (flight.getTime().equals(time)) {
                        result.add(flight);
                    }
                }
                break;

            case "location":
                for (Flight flight : flights) {
                    if (flight.getLocation().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "operator":
                for (Flight flight : flights) {
                    if (flight.getOperator().contains(value)) {
                        result.add(flight);
                    }
                }
                break;
            case "flight":
                for (Flight flight : flights) {
                    if (flight.getFlight().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "route":
                for (Flight flight : flights) {
                    if (flight.getRoute().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "type":
                for (Flight flight : flights) {
                    if (flight.getType().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "registration":
                for (Flight flight : flights) {
                    if (flight.getRegistration().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "cnin":
                for (Flight flight : flights) {
                    if (flight.getCnIn().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "aboard":
                for (Flight flight : flights) {
                    if (flight.getAboard() == Integer.parseInt(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "fatalities":
                for (Flight flight : flights) {
                    if (flight.getFatalities() == Integer.parseInt(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "ground":
                for (Flight flight : flights) {
                    if (flight.getGround() == Integer.parseInt(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "survivors":
                for (Flight flight : flights) {
                    if (flight.getSurvivors() == Integer.parseInt(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "survivalrate":
                for (Flight flight : flights) {
                    if (flight.getSurvivalRate() == Double.parseDouble(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "summary":
                for (Flight flight : flights) {
                    if (flight.getSummary().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            case "clustid":
                for (Flight flight : flights) {
                    if (flight.getClustId().contains(value)) {
                        result.add(flight);
                    }
                }
                break;

            default:
                System.out.println("Enter a valid input!");
        }

        ListFunctionality.listAllFields(result);
    }
}

import java.time.*;
import java.util.*;

public class FilterFunctionality {
    public static void run(List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);

        Operation operation = new Operation();
        System.out.print("Enter the field: ");
        String field = scanner.next();

        System.out.println("Enter the operation type: ");

        if (field.equals("date")) {
            System.out.println("Press 1 for a specific year");
            System.out.println("Press 2 for a specific month");
            System.out.println("Press 3 for a specific day");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operation.setOperation("year");
                    break;

                case 2:
                    operation.setOperation("month");
                    break;

                case 3:
                    operation.setOperation("day");
                    break;
            }
        }

        System.out.println("Enter the value:");
        String value = scanner.next();
        operation.setValue(value);

        if (field.equals("date") || field.equals("time")) {
            filterDateAndTime(flights, operation);
        }
    }

    public static void filterDateAndTime(List<Flight> flights, Operation operation) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (operation.getOperation().equals("year")) {
                System.out.println(operation.getValue());
                if (flight.getDate().getYear() == Integer.parseInt(operation.getValue())) {
                    result.add(flight);
                }
            }

            if (operation.getOperation().equals("month")) {
                if (flight.getDate().getMonth().getValue() == Integer.parseInt(operation.getValue())) {
                    result.add(flight);
                }
            }

            if (operation.getOperation().equals("day")) {
                if (flight.getDate().getDayOfMonth() == Integer.parseInt(operation.getValue())) {
                    result.add(flight);
                }
            }
        }

        ListFunctionality.listAllFields(result);
    }
}

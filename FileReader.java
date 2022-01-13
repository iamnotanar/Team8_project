import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FileReader {
    public static List<Flight> readFlights() {
        List<Flight> flights = new ArrayList<>();
        Path path = Paths.get("src/Large_Passenger_Plane_Crashes_1933_to_2009.csv");

        boolean head = true;
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
            String line = br.readLine();

            while (line != null) {
                if (head) {
                    head = false;
                    line = br.readLine();
                    continue;
                }
                String[] details = line.split(",");
                Flight flight = createFlight(details);
                flights.add(flight);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return flights;
    }

    private static Flight createFlight(String[] details) {
        LocalDate date = null;
        LocalTime time = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");

        if (!Objects.equals(details[0], "")) {
            date = LocalDate.parse(details[0], formatter);
        }

        if (!Objects.equals(details[1], "")) {
            if(details[1].length() == 4) {
                details[1] = "0" + details[1];
            }
            time = LocalTime.parse(details[1]);
        }

        String location = details[2];
        String operator = details[3];
        String flight = details[4];
        String route = details[5];
        String type = details[6];
        String registration = details[7];
        String cnIn = details[8];
        int aboard = Integer.parseInt(details[9]);
        int fatalities = Integer.parseInt(details[10]);
        int ground = Integer.parseInt(details[11]);
        int survivors = Integer.parseInt(details[12]);
        double survivalRate = Double.parseDouble(details[13]);
        String summary = details[14];
        String clustId = details[15];

        return new Flight(date, time, location, operator, flight, route, type, registration, cnIn, aboard, fatalities, ground, survivors, survivalRate, summary, clustId);
    }
}


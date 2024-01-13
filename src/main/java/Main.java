import java.io.IOException;

public class Main {

    private final static String URL = "https://ticket.pobeda.aero/websky/" +
            "?origin-city-code%5B0%5D=OGZ" +
            "&destination-city-code%5B0%5D=VKO" +
            "&date%5B0%5D=08.01.2024" +
            "&segmentsCount=1" +
            "&adultsCount=1" +
            "&youngAdultsCount=0" +
            "&childrenCount=0" +
            "&infantsWithSeatCount=0" +
            "&infantsWithoutSeatCount=0" +
            "&lang=ru#/search";

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec(String.format("cmd /c start chrome \"%s\"", URL));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

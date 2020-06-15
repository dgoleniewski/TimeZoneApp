import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> timeZones;
    static Gson gson;
    static Scanner scanner;

    public static void main(String[] args) {
        timeZones = new ArrayList<>();
        gson = new Gson();
        scanner = new Scanner(System.in);
        enterTimeZone();
    }

    private static void enterTimeZone() {
        String userInput;
        System.out.println("Enter your time zone:");
        userInput = scanner.nextLine().toLowerCase();
        TimeZone timeZone;
        if(isCorrectTimeZone(userInput)) {
            StringBuilder content = getResponse(userInput);
            if(content != null){
                timeZone = gson.fromJson(content.toString(), TimeZone.class);
                System.out.println("Time in this time zone is: " + timeZone.getDatetime().substring(11, 19));
            }
        }
    }

    private static boolean isCorrectTimeZone(String timeZone) {
        if(timeZones.isEmpty()) {
            StringBuilder content = getResponse("");
            if(content != null){
                timeZones = gson.fromJson(content.toString().toLowerCase(), ArrayList.class);
            }
        }
        if (timeZones.contains(timeZone)) {
            return true;
        }
        else {
            for (String time : timeZones) {
                System.out.println(time);
            }
            System.out.println("\nFind your time zone above");
            enterTimeZone();
            return false;
        }
    }

    private static StringBuilder getResponse(String suffix){
        try {
            URL url = new URL("http://worldtimeapi.org/api/timezone/" + suffix);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int code = connection.getResponseCode();
            if (code > 299) {
                System.out.println("API has problems, please try again later (error code: " + code + ")");
                return null;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();
            return content;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
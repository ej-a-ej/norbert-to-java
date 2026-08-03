/**
 * CHAPITRE 22 — RÉSEAU
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    public static String getWeather(String city) {
        if (city == null || city.trim().isEmpty()) {
            return "Please provide a city name.";
        }
        try {
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" +
                            city.trim().replace(" ", "%20") +
                            "&appid=YOUR_API_KEY&units=metric";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                return "Weather service unavailable (code: " + responseCode + ")";
            }
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            String json = response.toString();
            if (json.contains("\"main\"")) {
                String temp = extractValue(json, "temp");
                String description = extractValue(json, "description");
                return "Weather in " + city + ": " + description +
                       ", " + temp + "°C";
            }
            return "Could not parse weather data.";
        } catch (Exception e) {
            return "Could not get the weather right now: " + e.getMessage();
        }
    }

    private static String extractValue(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int start = json.indexOf(searchKey);
        if (start == -1) return "unknown";
        start += searchKey.length();
        while (json.charAt(start) == ' ') start++;
        if (json.charAt(start) == '"') {
            int end = json.indexOf("\"", start + 1);
            return json.substring(start + 1, end);
        }
        int end = start;
        while (end < json.length() &&
               (Character.isDigit(json.charAt(end)) || json.charAt(end) == '.' || json.charAt(end) == '-')) {
            end++;
        }
        return json.substring(start, end);
    }
}

class JokeService {
    private static final String[] JOKES = {
        "Why do programmers prefer dark mode? Because light attracts bugs!",
        "Why did the Java developer wear glasses? Because he couldn't C#!",
        "What do you call a programmer who doesn't drink coffee? Decaffeinated!"
    };
    public static String getRandomJoke() {
        int index = (int)(Math.random() * JOKES.length);
        return JOKES[index];
    }
}

class ConnectionCheck {
    public static boolean isOnline() {
        try {
            URL url = new URL("https://www.google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            int status = connection.getResponseCode();
            connection.disconnect();
            return status == 200;
        } catch (Exception e) {
            return false;
        }
    }
}

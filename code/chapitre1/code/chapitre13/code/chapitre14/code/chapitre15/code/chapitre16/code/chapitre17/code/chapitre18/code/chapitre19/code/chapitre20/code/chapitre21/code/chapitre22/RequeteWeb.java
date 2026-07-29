import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequeteWeb {
    
    public static String get(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                return "Erreur HTTP: " + responseCode;
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
            
            return response.toString();
            
        } catch (Exception e) {
            return "Erreur: " + e.getMessage();
        }
    }
    
    public static boolean estAccessible(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(3000);
            int code = connection.getResponseCode();
            connection.disconnect();
            return code == 200;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("🌐 Test de connexion...");
        boolean ok = estAccessible("https://www.google.com");
        System.out.println("Connexion: " + (ok ? "✅ OK" : "❌ Échec"));
        
        String resultat = get("https://api.github.com");
        System.out.println("Réponse: " + resultat.substring(0, Math.min(200, resultat.length())) + "...");
    }
}

public class ServiceMeteo {
    
    public static String getMeteo(String ville) {
        if (ville == null || ville.trim().isEmpty()) {
            return "Je n'ai pas compris la ville.";
        }
        
        String villePropre = ville.trim().toLowerCase();
        
        if (villePropre.contains("paris")) {
            return "🌤️ Paris : 18°C, ciel dégagé";
        } else if (villePropre.contains("lyon")) {
            return "🌧️ Lyon : 15°C, pluie légère";
        } else if (villePropre.contains("marseille")) {
            return "☀️ Marseille : 24°C, ensoleillé";
        } else if (villePropre.contains("bordeaux")) {
            return "⛅ Bordeaux : 20°C, nuageux";
        } else {
            return "Je ne connais pas la météo pour " + ville + ".";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(getMeteo("Paris"));
        System.out.println(getMeteo("Lyon"));
        System.out.println(getMeteo("New York"));
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GestionFichiers {
    
    public static void sauvegarderReponses(HashMap<String, String> reponses, String nomFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
            for (String cle : reponses.keySet()) {
                writer.println(cle + "|||" + reponses.get(cle));
            }
            System.out.println("✅ Réponses sauvegardées dans " + nomFichier);
        } catch (IOException e) {
            System.out.println("❌ Erreur sauvegarde : " + e.getMessage());
        }
    }
    
    public static HashMap<String, String> chargerReponses(String nomFichier) {
        HashMap<String, String> reponses = new HashMap<String, String>();
        File fichier = new File(nomFichier);
        if (!fichier.exists()) return reponses;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] parts = ligne.split("\\|\\|\\|");
                if (parts.length == 2) {
                    reponses.put(parts[0], parts[1]);
                }
            }
            System.out.println("📂 Réponses chargées (" + reponses.size() + " entrées)");
        } catch (IOException e) {
            System.out.println("❌ Erreur chargement : " + e.getMessage());
        }
        return reponses;
    }
    
    public static void sauvegarderHistorique(ArrayList<String> historique, String nomFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
            for (String ligne : historique) {
                writer.println(ligne);
            }
            System.out.println("✅ Historique sauvegardé");
        } catch (IOException e) {
            System.out.println("❌ Erreur sauvegarde : " + e.getMessage());
        }
    }
    
    public static ArrayList<String> chargerHistorique(String nomFichier) {
        ArrayList<String> historique = new ArrayList<String>();
        File fichier = new File(nomFichier);
        if (!fichier.exists()) return historique;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                historique.add(ligne);
            }
            System.out.println("📂 Historique chargé (" + historique.size() + " lignes)");
        } catch (IOException e) {
            System.out.println("❌ Erreur chargement : " + e.getMessage());
        }
        return historique;
    }
    
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<String, String>();
        test.put("bonjour", "Bonjour !");
        test.put("salut", "Salut !");
        
        sauvegarderReponses(test, "test.txt");
        HashMap<String, String> charge = chargerReponses("test.txt");
        System.out.println("Contenu chargé : " + charge);
    }
}

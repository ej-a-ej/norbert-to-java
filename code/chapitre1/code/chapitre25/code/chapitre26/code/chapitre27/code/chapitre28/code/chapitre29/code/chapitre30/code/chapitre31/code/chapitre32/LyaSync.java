import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LyaSync {
    private static final String FICHIER_SYNC = "lya_sync.txt";
    private static final String SEPARATEUR = "|||";
    
    public static void sauvegarder(ArrayList<String> historique, 
                                   HashMap<String, String> reponses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FICHIER_SYNC))) {
            writer.println("VERSION|||1.0");
            writer.println("DATE|||" + System.currentTimeMillis());
            writer.println("NB_HISTORIQUE|||" + historique.size());
            writer.println("NB_REPONSES|||" + reponses.size());
            
            for (String ligne : historique) {
                writer.println("HISTORIQUE|||" + ligne);
            }
            for (String cle : reponses.keySet()) {
                writer.println("REPONSE|||" + cle + SEPARATEUR + reponses.get(cle));
            }
            System.out.println("✅ Synchronisation sauvegardée !");
        } catch (IOException e) {
            System.out.println("❌ Erreur de synchronisation : " + e.getMessage());
        }
    }
    
    public static void charger(ArrayList<String> historique, 
                               HashMap<String, String> reponses) {
        File fichier = new File(FICHIER_SYNC);
        if (!fichier.exists()) {
            System.out.println("📂 Aucune synchronisation trouvée.");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FICHIER_SYNC))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] parts = ligne.split("\\|\\|\\|");
                if (parts.length == 2) {
                    if (parts[0].equals("HISTORIQUE")) {
                        historique.add(parts[1]);
                    } else if (parts[0].equals("REPONSE")) {
                        String[] rep = parts[1].split("\\|\\|\\|");
                        if (rep.length == 2) {
                            reponses.put(rep[0], rep[1]);
                        }
                    }
                }
            }
            System.out.println("📂 Synchronisation chargée !");
        } catch (IOException e) {
            System.out.println("❌ Erreur de chargement : " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> historique = new ArrayList<String>();
        HashMap<String, String> reponses = new HashMap<String, String>();
        
        historique.add("Demande : bonjour");
        historique.add("Réponse : Bonjour !");
        reponses.put("bonjour", "Bonjour !");
        reponses.put("salut", "Salut !");
        
        sauvegarder(historique, reponses);
        
        ArrayList<String> nouveauHistorique = new ArrayList<String>();
        HashMap<String, String> nouvellesReponses = new HashMap<String, String>();
        charger(nouveauHistorique, nouvellesReponses);
        
        System.out.println("Historique chargé : " + nouveauHistorique);
        System.out.println("Réponses chargées : " + nouvellesReponses);
    }
}

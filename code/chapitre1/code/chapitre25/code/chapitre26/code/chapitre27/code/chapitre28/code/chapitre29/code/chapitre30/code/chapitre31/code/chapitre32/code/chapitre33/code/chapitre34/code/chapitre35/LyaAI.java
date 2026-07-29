import java.util.ArrayList;
import java.util.HashMap;

public class LyaAI {
    private LearningMemory memory;
    private IntentRecognizer recognizer;
    private HashMap<String, String> reponsesBase;
    
    public LyaAI() {
        this.memory = new LearningMemory();
        this.recognizer = new IntentRecognizer();
        this.reponsesBase = new HashMap<String, String>();
        
        reponsesBase.put("salutation", "Bonjour ! Comment puis-je t'aider ?");
        reponsesBase.put("au_revoir", "Au revoir ! À bientôt.");
        reponsesBase.put("aide", "Je peux répondre à tes questions. Que veux-tu savoir ?");
        reponsesBase.put("meteo", "Je ne peux pas encore donner la météo précise.");
        reponsesBase.put("question", "Je ne sais pas encore répondre à cette question.");
    }
    
    public void repondre(String demande) {
        if (demande == null || demande.trim().isEmpty()) {
            System.out.println("❌ Demande vide.");
            return;
        }
        
        // 1. Vérifier la mémoire
        String reponse = memory.getReponse(demande);
        if (reponse != null) {
            System.out.println("🧠 " + reponse);
            return;
        }
        
        // 2. Reconnaître l'intention
        String intention = recognizer.reconnaitre(demande);
        
        // 3. Répondre selon l'intention
        if (reponsesBase.containsKey(intention)) {
            System.out.println("🤖 " + reponsesBase.get(intention));
        } else {
            System.out.println("🤔 Je ne comprends pas encore. Peux-tu reformuler ?");
            System.out.println("💡 Tu peux m'apprendre avec 'apprendre [question] | [réponse]'");
        }
    }
    
    public void apprendre(String demande, String reponse) {
        memory.apprendre(demande, reponse);
    }
    
    public void afficherConnaissances() {
        memory.afficherConnaissances();
    }
    
    public static void main(String[] args) {
        LyaAI lya = new LyaAI();
        
        lya.repondre("bonjour");
        lya.repondre("météo à Paris");
        lya.repondre("aide");
        
        lya.apprendre("ça va", "Je vais bien, merci ! Et toi ?");
        lya.repondre("ça va");
        
        lya.afficherConnaissances();
    }
}

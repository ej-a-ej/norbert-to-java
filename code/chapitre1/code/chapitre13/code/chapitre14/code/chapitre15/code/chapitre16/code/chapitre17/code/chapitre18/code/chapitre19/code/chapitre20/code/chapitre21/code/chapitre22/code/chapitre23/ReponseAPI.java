public class ReponseAPI {
    private boolean succes;
    private String message;
    private Object donnees;
    
    public ReponseAPI(boolean succes, String message, Object donnees) {
        this.succes = succes;
        this.message = message;
        this.donnees = donnees;
    }
    
    public ReponseAPI(boolean succes, String message) {
        this(succes, message, null);
    }
    
    public boolean isSucces() { return succes; }
    public String getMessage() { return message; }
    public Object getDonnees() { return donnees; }
    
    public String toJson() {
        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"succes\":").append(succes).append(",");
        json.append("\"message\":\"").append(echapperJson(message)).append("\",");
        if (donnees != null) {
            json.append("\"donnees\":").append(donnees.toString());
        } else {
            json.append("\"donnees\":null");
        }
        json.append("}");
        return json.toString();
    }
    
    private String echapperJson(String texte) {
        if (texte == null) return "";
        return texte.replace("\\", "\\\\")
                   .replace("\"", "\\\"")
                   .replace("\n", "\\n")
                   .replace("\r", "\\r");
    }
    
    @Override
    public String toString() {
        return toJson();
    }
    
    public static void main(String[] args) {
        ReponseAPI reponse = new ReponseAPI(true, "Succès", "Données de test");
        System.out.println(reponse.toJson());
        
        ReponseAPI erreur = new ReponseAPI(false, "Erreur");
        System.out.println(erreur.toJson());
    }
}

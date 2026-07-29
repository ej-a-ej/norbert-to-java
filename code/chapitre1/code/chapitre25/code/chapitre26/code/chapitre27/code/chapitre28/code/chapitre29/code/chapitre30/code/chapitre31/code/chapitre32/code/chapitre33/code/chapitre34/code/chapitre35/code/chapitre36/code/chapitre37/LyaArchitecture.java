public class LyaArchitecture {
    private String nom;
    private String version;
    private boolean active;
    
    public LyaArchitecture() {
        this.nom = "Lya";
        this.version = "2.0";
        this.active = true;
        
        System.out.println("🏗️ Lya Architecture v" + version);
        System.out.println("===========================");
        System.out.println("📋 Couches de l'application :");
        System.out.println("   - Présentation (interface)");
        System.out.println("   - Logique métier (services)");
        System.out.println("   - Données (repository)");
        System.out.println("   - Infrastructure (web, sécurité)");
    }
    
    public String getNom() { return nom; }
    public String getVersion() { return version; }
    public boolean isActive() { return active; }
    
    public void afficherStatut() {
        System.out.println("\n📊 Statut de Lya :");
        System.out.println("   - Nom : " + nom);
        System.out.println("   - Version : " + version);
        System.out.println("   - Active : " + (active ? "✅ Oui" : "❌ Non"));
    }
    
    public static void main(String[] args) {
        LyaArchitecture lya = new LyaArchitecture();
        lya.afficherStatut();
    }
}

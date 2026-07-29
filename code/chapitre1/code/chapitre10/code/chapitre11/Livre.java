public class Livre {
    private String titre;
    private String auteur;
    private int pages;
    
    public Livre(String titre, String auteur, int pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }
    
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getPages() { return pages; }
    
    public void afficher() {
        System.out.println(titre + " - " + auteur + " (" + pages + " pages)");
    }
}

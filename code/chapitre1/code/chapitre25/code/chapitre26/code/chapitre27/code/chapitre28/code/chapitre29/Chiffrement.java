import java.util.Base64;

public class Chiffrement {
    
    public static String chiffrer(String texte) {
        if (texte == null) return "";
        return Base64.getEncoder().encodeToString(texte.getBytes());
    }
    
    public static String dechiffrer(String texteChiffre) {
        if (texteChiffre == null) return "";
        try {
            byte[] decoded = Base64.getDecoder().decode(texteChiffre);
            return new String(decoded);
        } catch (IllegalArgumentException e) {
            return "Erreur de déchiffrement";
        }
    }
    
    public static String masquer(String texte) {
        if (texte == null || texte.length() <= 4) {
            return "****";
        }
        return texte.substring(0, 2) + "****" + texte.substring(texte.length() - 2);
    }
    
    public static boolean estMotDePasseFort(String motDePasse) {
        if (motDePasse == null || motDePasse.length() < 8) {
            return false;
        }
        boolean aMajuscule = false, aMinuscule = false, aChiffre = false, aSpecial = false;
        for (char c : motDePasse.toCharArray()) {
            if (Character.isUpperCase(c)) aMajuscule = true;
            if (Character.isLowerCase(c)) aMinuscule = true;
            if (Character.isDigit(c)) aChiffre = true;
            if (!Character.isLetterOrDigit(c)) aSpecial = true;
        }
        return aMajuscule && aMinuscule && aChiffre && aSpecial;
    }
    
    public static void main(String[] args) {
        String message = "Message secret";
        String chiffre = chiffrer(message);
        System.out.println("🔒 Chiffré : " + chiffre);
        System.out.println("🔓 Déchiffré : " + dechiffrer(chiffre));
        System.out.println("👤 Masqué : " + masquer("Norbert"));
        System.out.println("🔑 Mot de passe fort : " + estMotDePasseFort("Mot2p@sse!"));
    }
}

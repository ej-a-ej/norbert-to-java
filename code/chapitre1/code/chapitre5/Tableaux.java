public class Tableaux {
    public static void main(String[] args) {
        String[] courses = {"pain", "lait", "oeufs", "pommes", "beurre"};
        
        System.out.println("Premier article : " + courses[0]);
        System.out.println("Dernier article : " + courses[courses.length - 1]);
        
        System.out.println("\nMa liste de courses :");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("- " + courses[i]);
        }
    }
}

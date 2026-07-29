import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class GestionClient implements Runnable {
    private Socket client;
    private int numeroClient;
    private static int compteur = 0;
    
    public GestionClient(Socket client) {
        this.client = client;
        this.numeroClient = ++compteur;
    }
    
    @Override
    public void run() {
        String nomThread = Thread.currentThread().getName();
        System.out.println("👤 [Thread " + nomThread + "] Client #" + numeroClient);
        
        try {
            BufferedReader entree = new BufferedReader(
                new InputStreamReader(client.getInputStream())
            );
            String ligne = entree.readLine();
            
            if (ligne == null) {
                client.close();
                return;
            }
            
            System.out.println("📤 [Client #" + numeroClient + "] " + ligne);
            String reponse = "👋 Bonjour Client #" + numeroClient + " ! (servi par " + nomThread + ")";
            
            OutputStream sortie = client.getOutputStream();
            sortie.write(("HTTP/1.1 200 OK\n\n" + reponse).getBytes());
            
            client.close();
            System.out.println("✅ [Client #" + numeroClient + "] déconnecté.\n");
            
        } catch (Exception e) {
            System.out.println("❌ [Client #" + numeroClient + "] Erreur : " + e.getMessage());
        }
    }
}

public class ServeurMulticlient {
    public static void main(String[] args) {
        System.out.println("🚀 Lya multiclient sur le port 8080...");
        System.out.println("👥 Plusieurs clients peuvent se connecter !\n");
        
        try {
            ServerSocket serveur = new ServerSocket(8080);
            int total = 0;
            
            while (total < 10) {
                Socket client = serveur.accept();
                total++;
                
                GestionClient gestion = new GestionClient(client);
                Thread thread = new Thread(gestion);
                thread.setName("Serveur-" + total);
                thread.start();
            }
            
            System.out.println("\n⏹️ Serveur arrêté.");
            serveur.close();
            
        } catch (Exception e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
}

import java.io.*;
import java.net.Socket;

public class Client {

    private String nome;
    private String colore;
    private Socket socket;

    public Client(String nome) {
        this.nome = nome;
    }

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public int connetti(String nomeServer, int portaServer) {
        try {
            socket = new Socket(nomeServer, portaServer);
            return 0; // ok
        } catch (IOException e) {
            e.printStackTrace();
            return -1; // errore
        }
    }

    public void scrivi(String messaggio) {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(messaggio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leggi() {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chiudi() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

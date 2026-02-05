public class MainServer {

    public static void main(String[] args) {
        Server server = new Server(5000);

        server.attendi();
        server.leggi();
        server.scrivi("Ciao client!");
        server.chiudi();
        server.termina();
    }
}

public class MainServer {

    public static void main(String[] args) {
        Server server = new Server(5000);

        server.attendi();
        server.leggi();
        server.scrivi("Ciao Mario!");
        server.chiudi();
        server.termina();
    }
}

public class MainClient {

    public static void main(String[] args) {
        Client client = new Client("Mario", "blu");

        if (client.connetti("localhost", 5000) == 0) {
            client.scrivi("Ciao server!");
            client.leggi();
            client.chiudi();
        }
    }
}

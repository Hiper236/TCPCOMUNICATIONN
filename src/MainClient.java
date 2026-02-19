public class MainClient {

    public static void main(String[] args) {
        Client Mario = new Client("Mario", "blu");

        if (Mario.connetti("localhost", 5000) == 0) {
            Mario.scrivi("Ciao gennarino uaglio!");
            Mario.leggi();
            Mario.chiudi();
        }
    }
}

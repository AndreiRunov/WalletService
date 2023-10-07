import ApplicationServices.AppController;

public class WalletApp {
    public static void main(String[] args) {
        AppController atm = AppController.getIstance();
        atm.launch();

    }
}

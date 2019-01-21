package lab8;

public class Application {
    private BankController controller = new BankController();
    private View view = new View(controller);

    public static void main(String[] args) {
        new Application().run();
    }

    void run() {
        view.initUI();
    }
}

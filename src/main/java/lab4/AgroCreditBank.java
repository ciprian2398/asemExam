package lab4;

public class AgroCreditBank extends CreditBank {
    private double percentage;
    private double term;

    public AgroCreditBank(String creditDepartmentManager, double percentage, double term) {
        super(creditDepartmentManager);
        this.percentage = percentage;
        this.term = term;
    }

    public AgroCreditBank(String name, String address, String creditDepartmentManager, double percentage, double term) {
        super(name, address, creditDepartmentManager);
        this.percentage = percentage;
        this.term = term;
    }

    public AgroCreditBank(String name, String address, String ceo, String webPage, double valueEU, double valueUSD, String creditDepartmentManager, double percentage, double term) {
        super(name, address, ceo, webPage, valueEU, valueUSD, creditDepartmentManager);
        this.percentage = percentage;
        this.term = term;
    }
}

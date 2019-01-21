package lab4;

import lab3.Bank;

public class CreditBank extends Bank {
    private String creditDepartmentManager;

    public CreditBank(String creditDepartmentManager) {
        this.creditDepartmentManager = creditDepartmentManager;
    }

    public CreditBank(String name, String address, String creditDepartmentManager) {
        super(name, address);
        this.creditDepartmentManager = creditDepartmentManager;
    }

    public CreditBank(String name, String address, String ceo, String webPage, double valueEU, double valueUSD, String creditDepartmentManager) {
        super(name, address, ceo, webPage, valueEU, valueUSD);
        this.creditDepartmentManager = creditDepartmentManager;
    }

    public String getCreditDepartmentManager() {
        return creditDepartmentManager;
    }

    public void setCreditDepartmentManager(String creditDepartmentManager) {
        this.creditDepartmentManager = creditDepartmentManager;
    }

    @Override
    public String toString() {
        return "CreditBank{" +
                "creditDepartmentManager='" + creditDepartmentManager + '\'' +
                "} " + super.toString();
    }
}

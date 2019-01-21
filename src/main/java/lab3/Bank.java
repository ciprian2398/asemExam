package lab3;

import java.io.Serializable;

public class Bank implements Serializable{
    private String name;
    private String address;
    private String ceo;
    private String webPage;
    private double valueEU;
    private double valueUSD;

    public Bank() {
    }

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.ceo = "no CEO";
        this.webPage = "no web page";
    }

    public Bank(String name, String address, String ceo, String webPage, double valueEU, double valueUSD) {
        this.name = name;
        this.address = address;
        this.ceo = ceo;
        this.webPage = webPage;
        this.valueEU = valueEU;
        this.valueUSD = valueUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public double getValueEU() {
        return valueEU;
    }

    public void setValueEU(double valueEU) {
        this.valueEU = valueEU;
    }

    public double getValueUSD() {
        return valueUSD;
    }

    public void setValueUSD(double valueUSD) {
        this.valueUSD = valueUSD;
    }

    public double bigestValue() {
        return (valueEU > valueUSD) ? valueEU : valueUSD;
    }

    public double changeToEU(double mdl){
        return mdl/valueEU;
    }

    public double changeToUSD(double mdl){
        return mdl/valueUSD;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ceo='" + ceo + '\'' +
                ", webPage='" + webPage + '\'' +
                ", valueEU=" + valueEU +
                ", valueUSD=" + valueUSD +
                '}';
    }
}

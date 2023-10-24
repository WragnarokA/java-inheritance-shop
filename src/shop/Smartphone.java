package shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private String imei;
    private int memoria;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, String imei, int memoria) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getName()   +
                ", vat=" + getVat() +
                "imei='" + imei + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}

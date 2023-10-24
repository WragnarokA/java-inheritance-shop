package shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String color;
    private boolean isWireless;

    public Cuffie(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, description, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getName()   +
                ", vat=" + getVat() +
                "color='" + color + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}

package shop;

import java.math.BigDecimal;

public class Television extends Prodotto{
    private int dimension;
    private boolean isSmart;

    public Television(String name, String description, BigDecimal price, BigDecimal vat, int dimension, boolean isSmart) {
        super(name, description, price, vat);
        this.dimension = dimension;
        this.isSmart = isSmart;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return "Television{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getName()   +
                ", vat=" + getVat() +
                "dimension=" + dimension +
                ", isSmart=" + isSmart +
                '}';
    }
}

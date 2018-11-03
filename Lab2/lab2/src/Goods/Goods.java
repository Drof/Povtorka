package Goods;

public abstract class Goods {

    private String name;
    private String manufacturer;
    private double price;
    private int amount;
    private String material;

    public abstract GoodsType getGoodsType();

    public String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getManufacturer() {
        return manufacturer;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getAmount() {
        return amount;
    }

    void setAmount(int amount) {
        this.amount = amount;
    }

}
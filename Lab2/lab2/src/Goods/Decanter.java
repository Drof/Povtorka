package Goods;

public final class Decanter extends Goods {

    private final GoodsType goodsType = GoodsType.DECANTER;
    private double weight;
    private double volume;
    private double size;


    public Decanter(String name, double price, String manufacturer, String material, int amount, double volume, double weight, double size) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setMaterial(material);
        setAmount(amount);
        setVolume(volume);
        setWeight(weight);
        setSize(size);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Material = " + getMaterial() + " Volume = " + getVolume() + " Size = " + getSize() + " Weight = " + getWeight() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private double getVolume() {
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    private double getSize() {
        return size;
    }

    private void setSize(double size) {
        this.size = size;
    }

    private double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }


}
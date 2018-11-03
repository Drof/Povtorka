package Goods;

public final class Ewer extends Goods {

    private final GoodsType goodsType = GoodsType.EWER;
    private double volume;


    public Ewer(String name, double price, String manufacturer, int amount, String material, double volume, String colour) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setMaterial(material);
        setAmount(amount);
        setVolume(volume);
        setMaterial(colour);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Material = " + getMaterial() + " Volume = " + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private double getVolume() {
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }


}
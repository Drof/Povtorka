package Goods;

public final class Glass extends Goods {

    private final GoodsType goodsType = GoodsType.GLASS;
    private double volume;
    private String colour;


    public Glass(String name, double price, String manufacturer, int amount, String material, double volume, String colour) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setAmount(amount);
        setMaterial(material);
        setVolume(volume);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Material = " + getMaterial() + " Colour = " + getColour() + " Volume = " + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private String getColour() {
        return colour;
    }

    private void setColour(String colour) {
        this.colour = colour;
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
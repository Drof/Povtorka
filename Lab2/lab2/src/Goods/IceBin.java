package Goods;

public final class IceBin extends Goods {

    private final GoodsType goodsType = GoodsType.ICE_BIN;
    private double size;
    private String colour;


    public IceBin(String name, double price, String manufacturer, int amount, String material, double size, String colour) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setAmount(amount);
        setMaterial(material);
        setSize(size);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getColour() + " Material = " + getMaterial() + " Size = " + getSize() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private String getColour() {
        return colour;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    private double getSize() {
        return size;
    }

    private void setSize(double size) {
        this.size = size;
    }

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }


}
package Goods;

public final class BottleScrew extends Goods {

    private final GoodsType goodsType = GoodsType.BOTTLE_SCREW;
    private double weight;
    private String colour;


    public BottleScrew(String name, double price, String manufacturer, int amount, String material, double weight, String colour) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setAmount(amount);
        setMaterial(material);
        setWeight(weight);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getColour() + " Material = " + getMaterial() + " Weight = " + getWeight() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private String getColour() {
        return colour;
    }

    private void setColour(String colour) {
        this.colour = colour;
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
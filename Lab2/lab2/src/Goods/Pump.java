package Goods;

public final class Pump extends Goods {

    private final GoodsType goodsType = GoodsType.PUMP;

    private double force;
    private String colour;
    private double rigidity;


    public Pump(String name, double price, String manufacturer, int amount, String material, double force, String colour, double rigidity) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        setAmount(amount);
        setMaterial(material);
        setForce(force);
        setColour(colour);
        setRigidity(rigidity);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getColour() + " Material = " + getManufacturer() + " Force = " + getForce() + " Rigidity = " + getRigidity() + " Amount = " + getAmount() + " Price = " + getPrice() + " Manufacturer = " + getManufacturer();
    }

    private double getRigidity() {
        return rigidity;
    }

    private void setRigidity(double rigidity) {
        this.rigidity = rigidity;
    }

    private String getColour() {
        return colour;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    private double getForce() {
        return force;
    }

    private void setForce(double force) {
        this.force = force;
    }

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }


}
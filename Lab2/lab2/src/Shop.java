import Goods.Goods;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class Shop {

    private String shopName;
    private String address;
    private int goodsAmount;
    private String workingHours;
    private List<Goods> goodsList = new LinkedList<>();

    Shop() {
    }

    public Shop(String shopName, String address, int goodsAmount, String workingHours, List<Goods> goodsList) {
        setShopName(shopName);
        setAddress(address);
        setGoodsAmount(goodsAmount);
        setWorkingHours(workingHours);
        setGoodsList(goodsList);
    }

    public void sortByPrice(List<Goods> result) {
        result.sort((t1, t2) -> {
            if ((t1.getPrice() - t2.getPrice()) >= 0) return 1;
            else if ((t1.getPrice() == t2.getPrice())) {
                return 0;
            } else return -1;
        });}

    public List<Goods> findByMaterial(String material) {
        List<Goods> result = new LinkedList<>();

        goodsList.stream().filter((goodsList) -> ((goodsList.getMaterial().equals(material)))).forEachOrdered(result::add);

        return result;
    }

    public String getShopName() {
        return shopName;
    }

    private void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    private void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    private void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    private void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods(Goods goods) {
        this.goodsList.add(goods);
    }
}
import Goods.*;
import java.util.List;

public class Main {

    private static void printList(List<Goods> List) {
        List.forEach((Goods x) -> System.out.println(x.toString()));
    }

    public static void main(String[] args) {
        Shop rozetka = new Shop();

        rozetka.addGoods(new BottleScrew("Bottle Screw", 144.2, "Samsung", 5, "Goods.Glass", 10.0, "Red"));
        rozetka.addGoods(new Decanter("Goods.Decanter", 150.2, "Audi", "Goods.Glass",25, 2, 10.0, 55));
        rozetka.addGoods(new Ewer("Goods.Ewer", 142.6, "BMW", 52, "Goods.Glass", 10.0, "Green"));
        rozetka.addGoods(new Glass("Goods.Glass", 202.5, "Puma", 15, "Goods.Glass", 10.0, "Black"));
        rozetka.addGoods(new IceBin("Goods.IceBin", 44.5, "Nike", 54, "Goods.Glass", 10.0, "Yellow"));
        rozetka.addGoods(new Pump("Goods.Pump", 644.2, "Lil Goods.Pump", 500, "Metal", 10.0, "Brown", 5));


        System.out.println("\nInitial list of goods:\n");
        printList(rozetka.getGoodsList());


        System.out.println("\nList of searched goods:\n");
        List<Goods> result = rozetka.findByMaterial("Goods.Glass");
        printList(result);


        System.out.println("\nSorted list:\n");
        rozetka.sortByPrice(result);
        printList(result);
    }
}
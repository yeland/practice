package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Commodity commodity1 = new Commodity(1, "phone", 1500);
        Commodity commodity2 = new Commodity(2, "phone", 3300);
        Commodity commodity3 = new Commodity(3, "television", 1200);
        Commodity[] commodities = new Commodity[]{commodity1, commodity2, commodity3};
        List<Commodity> commodityList = Arrays.asList(commodities);
        commodityList.forEach(item ->
                System.out.println(item.toString() + " is needed: " + getCommodity(item))
        );
    }

    public static boolean getCommodity(Commodity commodity) {
        return Optional.ofNullable(commodity).filter(item ->
                item.getName().equals("phone") && item.getPrice() >= 1000 && item.getPrice() <= 2000)
                .isPresent();
    }
}

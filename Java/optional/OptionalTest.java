package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Commodity phone = new Commodity(1, "phone", 1500);
        getCommodity(phone);
    }

    public static void getCommodity(Commodity commodity) {
        boolean isNeed = Optional.of(commodity).filter(item -> {
            boolean isName = item.getName().equals("phone");
            int price = item.getPrice();
            if (isName && price >= 1000 && price <= 2000) {
                return true;
            }
            return false;
        }).isPresent();

        if (isNeed) {
            System.out.println("是需要购买的商品");
        } else {
            System.out.println("不是需要购买的商品");
        }
    }
}

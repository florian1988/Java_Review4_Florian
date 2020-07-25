import java.util.HashMap;

public class Shop {


        int ShopId;
        String name;
        String address;

        Shop( int ShopId, String name, String address ){
            this.ShopId = ShopId;
            this.name = name;
            this.address = address;
        }





    public int getShopId() {
        return ShopId;
    }

    public void setShopId(int shopId) {
        ShopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

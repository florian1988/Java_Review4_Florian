import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop {


    int ShopId;
    String name;
    String address;
    Product b;

    Shop( int ShopId, String name, String address ){
        this.ShopId = ShopId;
        this.name = name;
        this.address = address;
    }



    public List<String[]> products = new ArrayList<String[]>();


    public void addProducts(int productId, String productName, int stock){

        if( stock > 15){
            System.out.println("Stock cant be greater then 15");
        }

        //products.add(new String[5]);
        products.add(new String[]{String.valueOf(productId), productName, String.valueOf(stock)});



       // System.out.println(products.size());
        //System.out.println(products.get(0)[2]);

    }

    public void printProduct(){
        for( int i = 0; i < products.size(); i++){

            System.out.print( "Id: " +products.get(i)[0] + " name: " + products.get(i)[1] + " Stock: " + products.get(i)[2] );
            /*for(int x = 0; x < 3; x++){
                System.out.print(products.get(i)[x]);
            }

             */
            System.out.println("");
        }
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

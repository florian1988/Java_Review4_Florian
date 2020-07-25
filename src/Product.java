import java.util.ArrayList;
import java.util.HashMap;

public class Product {

    int productId;
    int productIdCounter = 1;
    String productName;
    String productDescription;
    double productPrice;
    Category category;
     enum Category {
         Shirts, Jackets, Accessoires, Trousers, Pullovers
    }

    int stock;
    Shop[] shop = new Shop[3];


    Product( String name, String Description, double price,  Category category  ){

        this.productId = productIdCounter++;
        this.productName = name;
        this.productDescription = Description;
        this.productPrice = price;
        this.category = category;

    }

    Product(Shop shop1, Shop shop2){
        this.shop[1] = shop1;
        this.shop[2] = shop2;
    }

    public void show(){
         System.out.println( productId + " " + productName + " " + productDescription + " " + productPrice + " " + category + " " + stock  );
    }


    public void stock( int stock){

        if( stock > 15 ){
            System.out.println( "stock can't get over 15!");
        } else{
            this.stock = stock;
        }

    }

        ArrayList< Integer > shops = new ArrayList< Integer>();



    public void addItem(int shopId, int productId){



            shops.add(shop[shopId].getShopId());

            this.productId = productId;



        System.out.println(shop[shopId].getName() + " " + productId + "_ " + productName);
        System.out.println(shops.size());

    }







    public int getProductId() {
        return productId;
    }

    public int getProductIdCounter() {
        return productIdCounter;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public Shop[] getShop() {
        return shop;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductIdCounter(int productIdCounter) {
        this.productIdCounter = productIdCounter;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setShop(Shop[] shop) {
        this.shop = shop;
    }
}

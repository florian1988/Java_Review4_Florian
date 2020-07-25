import java.util.ArrayList;
import java.util.HashMap;

public class Product {

    int productId;
    private static int productIdCounter = 1;
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

        ArrayList< Integer > shop1 = new ArrayList< Integer>();
        ArrayList< Integer > shop2 = new ArrayList< Integer>();



    public void addItem(int shopId, int productId, String productName,  int stock){
            this.productId = productId;
            this.productName = productName;
            this.stock = stock;

            stock(stock);

            if(shopId == 1){
                shop1.add(productId);
                System.out.println("The Article " + this.productName + " with the Articlenumber " + this.productId + " get's to Shop " + shop[shopId].getName() + "  the sock is " + this.stock);
                System.out.println( "The amount of Articles in Shop one is = " + shop1.size());
            }else if(shopId == 2){
                shop2.add(productId);
                System.out.println("The Article " + this.productName + " with the Articlenumber " + this.productId + " get's to Shop " + shop[shopId].getName());
                System.out.println("The amount of Articles in Shop two is = " + shop2.size());

            } else{
                System.out.println("");
                System.out.println("no Shop found \n");
            }


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

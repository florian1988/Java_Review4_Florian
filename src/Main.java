import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        Welcome welcome = new Welcome();

        //welcome.welcomeMenu();

        Shop shop1 = new Shop(1, "fashionInn", "Vienna straßeirgendwas Straße 14");
        Shop shop2 = new Shop(2, "fashionOut", "Graz gasse Gasse 1");



        Product product1 = new Product("T-shirt Developer", "funny logo", 9.99, Product.Category.Shirts);
        Product product2 = new Product("Ring Developer", "to bind them", 100009.99, Product.Category.Accessoires);
        Product product3 = new Product("Jeans Developer", "pants", 59.99, Product.Category.Trousers);
        Product product4 = new Product("Jacket Developer", "funny back", 29.99, Product.Category.Jackets);
        Product product5 = new Product("Pullover Developer", "fluffy", 19.99, Product.Category.Pullovers);

        Product shops = new Product(shop1, shop2);

        HashMap <Integer, String> products = new HashMap <Integer, String>();

        products.put(product1.productId, product1.productName);
        products.put(product2.productId, product2.productName);
        products.put(product3.productId, product3.productName);
        products.put(product4.productId, product4.productName);
        products.put(product5.productId, product5.productName);

        /*for( Integer i : products.keySet()){
            System.out.println("ProductId: " + i + "  Product Name: " +products.get(i));
        }
         */

        //product1.stock(10);
        //product3.show();


        //shops.addItem(shop1.getShopId(), product2.getProductId(), product2.productName, 10);
        //shops.addItem(shop2.getShopId(), product4.getProductId(), product4.productName, 5);
        //shops.addItem(shop1.getShopId(), product2.getProductId(), product2.productName,5);


        shop1.addProducts(product1.getProductId(), product1.getProductName(), 5);
        shop1.addProducts(product2.getProductId(), product2.getProductName(), 7);
        shop1.addProducts(product3.getProductId(), product3.getProductName(), 9);
        shop1.addProducts(product4.getProductId(), product4.getProductName(), 3);
        shop1.addProducts(product5.getProductId(), product5.getProductName(), 6);

        shop2.addProducts(product1.getProductId(), product1.getProductName(), 5);
        shop2.addProducts(product2.getProductId(), product2.getProductName(), 7);
        shop2.addProducts(product3.getProductId(), product3.getProductName(), 9);
        shop2.addProducts(product4.getProductId(), product4.getProductName(), 3);
        shop2.addProducts(product5.getProductId(), product5.getProductName(), 6);



        //shop1.printProduct();
        //shop2.printProduct();


        User user1 = new User("Franz", "Förster", "förster@.at", "försterStr. 20", 3445 , 65432187 );
        User user2 = new User("Friz", "Finster", "finster@.at", "finsterStr. 20", 5478 , 13452354);
        User user3 = new User("Berta", "Birnbaum", "birnbaum@.at", "birnbaumStr. 20", 4125 , 6786789 );
        User user4 = new User("Beate", "Bauer", "bauer@.at", "bauerStr. 20", 7458 , 12341234 );



        HashMap <Integer, String> users = new HashMap <Integer, String>();

            users.put(user1.userId, user1.firstName);
            users.put(user2.userId, user2.firstName);
            users.put(user3.userId, user3.firstName);
            users.put(user4.userId, user4.firstName);

        /*for( Integer i : users.keySet()) {
            System.out.println("UserId: " + i + " Fist Name: " + users.get(i));
        }
         */




    }
}

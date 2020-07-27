import java.util.HashMap;
import java.util.List;

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


        product1.stockShop1(14);
        product2.stockShop1(8);
        product3.stockShop1(8);
        product4.stockShop1(8);
        product5.stockShop1(8);

        product1.stockShop2(15);
        product2.stockShop2(14);
        product3.stockShop2(9);
        product4.stockShop2(9);
        product5.stockShop2(9);



        //Product shops = new Product(shop1, shop2);

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


        shop1.addProducts(product1.getProductId(), product1.getProductName(), product1.getStock1());
        shop1.addProducts(product2.getProductId(), product2.getProductName(), product2.getStock1());
        shop1.addProducts(product3.getProductId(), product3.getProductName(), product3.getStock1());
        shop1.addProducts(product4.getProductId(), product4.getProductName(), product4.getStock1());
        shop1.addProducts(product5.getProductId(), product5.getProductName(), product5.getStock1());

        shop2.addProducts(product1.getProductId(), product1.getProductName(), product1.getStock2());
        shop2.addProducts(product2.getProductId(), product2.getProductName(), product2.getStock2());
        shop2.addProducts(product3.getProductId(), product3.getProductName(), product3.getStock2());
        shop2.addProducts(product4.getProductId(), product4.getProductName(), product4.getStock2());
        shop2.addProducts(product5.getProductId(), product5.getProductName(), product5.getStock2());


        //shop1.printProduct();
        //shop2.printProduct();


        product1.addProducts(shop1.ShopId);
        product1.addProducts(shop2.ShopId);
        product2.addProducts(shop1.ShopId);
        product2.addProducts(shop2.ShopId);
        product3.addProducts(shop1.ShopId);
        product3.addProducts(shop2.ShopId);
        product4.addProducts(shop1.ShopId);
        product4.addProducts(shop2.ShopId);
        product5.addProducts(shop1.ShopId);
        product5.addProducts(shop2.ShopId);

        product1.printProduct(shop2.getShopId());

        product1.replaceAmountFromStock(shop1.ShopId, 2);

        product1.replaceAmountFromStock(shop1.ShopId, 2);

        product1.replaceAmountFromStock(shop1.ShopId, 2);

        product2.printProduct(shop2.ShopId);
        product2.replaceAmountFromStock(shop2.ShopId, 3);

        product2.replaceAmountFromStock(shop2.ShopId, 3);
        product2.replaceAmountFromStock(shop2.ShopId, 3);
        product2.addAmountFromStock(shop2.ShopId, 5);


        User user1 = new User("Franz", "Förster", "förster@.at", "försterStr. 20", 3445 , 65432187 ,shop1,shop2);
        User user2 = new User("Friz", "Finster", "finster@.at", "finsterStr. 20", 5478 , 13452354,shop1, shop2);
        User user3 = new User("Berta", "Birnbaum", "birnbaum@.at", "birnbaumStr. 20", 4125 , 6786789,shop1, shop2);
        User user4 = new User("Beate", "Bauer", "bauer@.at", "bauerStr. 20", 7458 , 12341234,shop1, shop2);



        HashMap <Integer, String> users = new HashMap <Integer, String>();

            users.put(user1.userId, user1.firstName);
            users.put(user2.userId, user2.firstName);
            users.put(user3.userId, user3.firstName);
            users.put(user4.userId, user4.firstName);

        /*for( Integer i : users.keySet()) {
            System.out.println("UserId: " + i + " Fist Name: " + users.get(i));
        }
         */

        user1.addHistory(product1.productId,product1.productPrice,product1.productName, 2 );
        user1.addHistory(product1.productId,product1.productPrice,product1.productName, 2 );

        user3.addHistory(product1.productId,product1.productPrice,product1.productName, 2 );
        user3.addHistory(product1.productId,product1.productPrice,product1.productName, 2 );

        user1.printHistory();
        user3.printHistory();

        System.out.println("");
        System.out.println("");
















/*
        user1.history(product1.getProductId(), product1.getProductName(), product1.getProductPrice(), shop1.getShopId(),2 );
        user1.printHistory();
        shop1.replaceAmountFromStock(product1.getProductId(), product1.getProductName(),1, 2);

        product1.setStock1(6);

        System.out.println("");
        System.out.println("");


        user2.history(product3.getProductId(), product3.getProductName(), product3.getProductPrice(), shop2.getShopId(),1 );
        user2.printHistory();
        shop2.replaceAmountFromStock(product3.getProductId(),product3.getProductName(),3,1);

        product3.setStock2(8);

        System.out.println("");
        System.out.println("");

        user1.history(product4.getProductId(), product4.getProductName(), product4.getProductPrice(), shop1.getShopId(),3);
        user1.printHistory();
        shop1.replaceAmountFromStock(product4.getProductId(), product4.getProductName(),4, 3);

        product4.setStock1(5);

        System.out.println("");
        System.out.println("");

        user1.history(product5.getProductId(), product5.getProductName(), product5.getProductPrice(), shop1.getShopId(),3);
        user1.printHistory();
        shop1.replaceAmountFromStock(product4.getProductId(), product4.getProductName(),4, 3);


        product4.setStock1(2);

        System.out.println("");
        System.out.println("");

        product1.stockShop1(5);
        product4.stockShop1(10);

        product4.stockShop1(1);

 */









    }
}

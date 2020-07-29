import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //my test Objects

        Shop shop1 = new Shop(1, "fashionInn", "Vienna straßeirgendwas Straße 14");
        Shop shop2 = new Shop(2, "fashionOut", "Graz gasse Gasse 1");

        Product product1 = new Product("T-shirt Developer", "funny logo", 9.99, Product.Category.Shirts);
        Product product2 = new Product("Ring Developer", "to bind them", 100009.99, Product.Category.Accessoires);
        Product product3 = new Product("Jeans Developer", "pants", 59.99, Product.Category.Trousers);
        Product product4 = new Product("Jacket Developer", "funny back", 29.99, Product.Category.Jackets);
        Product product5 = new Product("Pullover Developer", "fluffy", 19.99, Product.Category.Pullovers);

        User user1 = new User("Franz", "Förster", "förster@.at", "försterStr. 20", 3445 , 65432187 ,shop1,shop2);
        User user2 = new User("Friz", "Finster", "finster@.at", "finsterStr. 20", 5478 , 13452354,shop1, shop2);
        User user3 = new User("Berta", "Birnbaum", "birnbaum@.at", "birnbaumStr. 20", 4125 , 6786789,shop1, shop2);
        User user4 = new User("Beate", "Bauer", "bauer@.at", "bauerStr. 20", 7458 , 12341234,shop1, shop2);

        //Stuff for the Menu because i was too stupid to do it better

        Welcome d = new Welcome();

        d.adToUsersOFShop(user1);
        d.adToUsersOFShop(user2);
        d.adToUsersOFShop(user3);
        d.adToUsersOFShop(user4);
        d.shopList(shop1);
        d.shopList(shop2);
        d.productList(product1);
        d.productList(product2);
        d.productList(product3);
        d.productList(product4);
        d.productList(product5);


        // add Stock for the products before they come to the ArrayList
        // there is a separate add method for the 2d Arraylist


        product1.stockShop1(14);
        product2.stockShop1(8);
        product3.stockShop1(12);
        product4.stockShop1(8);
        product5.stockShop1(8);

        product1.stockShop2(12);
        product2.stockShop2(14);
        product3.stockShop2(9);
        product4.stockShop2(9);
        product5.stockShop2(9);


        //Hashmap Products

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


        //HashMap User

        HashMap <Integer, String> users = new HashMap <Integer, String>();

        users.put(user1.userId, user1.firstName);
        users.put(user2.userId, user2.firstName);
        users.put(user3.userId, user3.firstName);
        users.put(user4.userId, user4.firstName);

        /*for( Integer i : users.keySet()) {
            System.out.println("UserId: " + i + " Fist Name: " + users.get(i));
        }
         */

        // i made two 2d ArrayLists because of the two different shops

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

        //Starting the  Menu
        d.welcomeMenu();
        d.welcomeMenu();
        d.welcomeMenu();
        d.welcomeMenu();


        // stock from product1 in the shop 1
        product1.printProduct(shop2.ShopId);
        // stock from product1 reduzed to 9
        product1.replaceAmountFromStock(shop2.ShopId, 5);
        product1.replaceAmountFromStock(shop2.ShopId, 5);
        // add to purchase history
        user3.addHistory(product1.productId,product1.productPrice, product1.productName, 5);
        user3.addHistory(product1.productId,product1.productPrice, product1.productName, 5);
        //print purchase history
        user3.printHistory();
        // add products to sock
        product1.addAmountFromStock(shop2.ShopId,6);



        d.printUserTxt(user3);






    }
}




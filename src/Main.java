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

        product1.stock(10); //custom error massage

        product1.show();


        shops.addItem(1, product2.productId);




    }
}

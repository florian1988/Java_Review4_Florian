import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

    int stock1;
    int stock2;

    Product(String name, String Description, double price, Category category) {

        this.productId = productIdCounter++;
        this.productName = name;
        this.productDescription = Description;
        this.productPrice = price;
        this.category = category;

    }

    Product(){

    }


    public void stockShop1(int stock) {
        int d = stock1 + stock;

        if (d > 15) {
            System.out.println("stock can't get over 15!");
        } else {
            this.stock1 = d;
            //  System.out.println("New Stock " + d);
        }

    }


    public void stockShop2(int stock) {
        int d = stock2 + stock;

        if (d > 15) {
            System.out.println("stock can't get over 15!");
        } else {
            this.stock2 = d;
            // System.out.println("New Stock " + d);
        }

    }


    public void show() {
        System.out.println(productId + " " + productName + " " + productDescription + " " + productPrice + " " + category + " " + stock1);
    }


    public List<List<String>> products1 = new ArrayList<List<String>>();
    public List<List<String>> products2 = new ArrayList<List<String>>();
    //public ArrayList<String[]> products = new ArrayList<String[]>();


    public void addProducts(int shopId) {

        ArrayList<String> singleProduct = new ArrayList<String>();
        if (shopId == 1) {
            if (stock1 > 15) {
                System.out.println("Stock cant be greater then 15");
            } else {
                singleProduct.add(String.valueOf(productId));
                singleProduct.add(productName);
                singleProduct.add(String.valueOf(stock1));
                singleProduct.add(String.valueOf(shopId));
                products1.add(singleProduct);
            }
        } else {
            if (stock2 > 15) {
                System.out.println("Stock cant be greater then 15");
            } else {
                singleProduct.add(String.valueOf(productId));
                singleProduct.add(productName);
                singleProduct.add(String.valueOf(stock2));
                singleProduct.add(String.valueOf(shopId));
                products2.add(singleProduct);
            }
        }

        //products.add(new String[] {String.valueOf(productId), productName, String.valueOf(stock)});

        // System.out.println(products.size());
        //System.out.println(products.get(0)[2]);

    }


    public void printProduct(int shopId) {

        if (shopId == 1) {
            for (int i = 0; i < products1.size(); i++) {

                System.out.print("Id: " + products1.get(i).get(0) + " name: " + products1.get(i).get(1) + " Stock: " + products1.get(i).get(2) + " ShopID: " + products1.get(i).get(3));
            /*for(int x = 0; x < 3; x++){
                System.out.print(products.get(i)[x]);
            } */
                System.out.println(" ");
            }
        } else {
            for (int i = 0; i < products2.size(); i++) {

                System.out.print("Id: " + products2.get(i).get(0) + " name: " + products2.get(i).get(1) + " Stock: " + products2.get(i).get(2) + " ShopID: " + products2.get(i).get(3));
            /*for(int x = 0; x < 3; x++){
                System.out.print(products.get(i)[x]);
            } */
                System.out.println(" ");
            }
        }

    }


    public void replaceAmountFromStock(int shopId, int minusStock) {

        // System.out.print(stock1);
        //System.out.print(shopId);
        if (shopId == 1) {
            int d = shopId - 1;

            //int f = Integer.parseInt(products1.get(stock1).get(2));
            //System.out.println(d);
            //System.out.print("f" + stock1);
            stock1 = stock1 - minusStock;


            products1.get(d).set(2, String.valueOf(stock1));

            //setStock1(stock1);

            int stock = Integer.parseInt(products1.get(d).get(2));
            if (stock < 5) {
                System.out.println("Warning! Stock " + productName + " in Shop " + shopId + " is under 5!!");
            }

            for (List<String> i : products1) {
                System.out.println(i);
            }
        } else {

            int d = shopId - 2;


            //System.out.print("f" + d);
            stock2 = stock2 - minusStock;

            //System.out.println(stock2);

            //System.out.println(d);

            products2.get(d).set(2, String.valueOf(stock2));


            //setStock2(stock2);
            int stock = Integer.parseInt(products2.get(d).get(2));
            if (stock < 5) {
                System.out.println("Warning! Stock " + productName + " in Shop " + shopId + " is under 5!!");
            }

            for (List<String> i : products2) {
                System.out.println(i);
            }
        }


    }


    public void addAmountFromStock(int shopId, int addStock) {

        // System.out.print(stock1);
        //System.out.print(shopId);
        try {
            if (shopId == 1) {
                int d = shopId - 1;

                //int f = Integer.parseInt(products1.get(stock1).get(2));
                //System.out.println(d);
                //System.out.print("f" + stock1);
                stock1 = stock1 + addStock;
                if(stock1 > 15){
                    String i = String.valueOf(stock1);
                    throw new StockLimitReachedException("Too much Products!! " + i + "   There are space for 15 pices!!!");
                }


                products1.get(d).set(2, String.valueOf(stock1));

                //setStock1(stock1);

                for (List<String> i : products1) {
                    System.out.println(i);
                }


            } else {

                int d = shopId - 2;


                //System.out.print("f" + d);
                stock2 = stock2 + addStock;

                if(stock2 > 15){
                    String i = String.valueOf(stock2);
                    throw new StockLimitReachedException("Too much Products!! " + i + "   There are space for 15 pices!!!");
                }
                //System.out.println(stock2);

                //System.out.println(d);

                products2.get(d).set(2, String.valueOf(stock2));


                //setStock2(stock2);

                for (List<String> i : products2) {
                    System.out.println(i);
                }


            }
        }catch(StockLimitReachedException e){
            System.out.println(e.getMessage());
        }
    }
/*
    public List<List<String>> Users = new ArrayList<List<String>>();

    public void addHistory(int userId, int shopId, String firstName, String lastName, int amount ){

        ArrayList<String> singleHistory = new ArrayList<String>();

        double price = productPrice * amount;

        singleHistory.add(String.valueOf(productId));
        singleHistory.add(String.valueOf(shopId));
        singleHistory.add(String.valueOf(userId));
        singleHistory.add(firstName);
        singleHistory.add(lastName);
        singleHistory.add(productName);
        singleHistory.add(String.valueOf(amount));
        singleHistory.add(String.valueOf(price));
        Users.add(singleHistory);

        User user = new User();
        user.historyList(singleHistory);
            replaceAmountFromStock(shopId, amount);
    }

    public void printHistory(){
        for( int i = 0; i < products1.size(); i++) {
            System.out.println("Product Id: " + Users.get(i).get(0));
            System.out.println("Shop Id: " + Users.get(i).get(1));
            System.out.println("User Id: " + Users.get(i).get(2));
            System.out.println("First Name: " + Users.get(i).get(3));
            System.out.println("Last Name: " + Users.get(i).get(4));
            System.out.println("Product Name: " + Users.get(i).get(5));
            System.out.println("Amount:" + Users.get(i).get(6));
            System.out.println("Product Price: " + Users.get(i).get(7));

        }

    }


 */





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

    public int getStock1() {
        return stock1;
    }
    public int getStock2() {
        return stock2;
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

    public void setStock1(int stock) {
        this.stock1 = stock;
    }

    public void setStock2(int stock) {
        this.stock2 = stock;
    }

    public List<List<String>> getProducts1() {
        return products1;
    }

    public void setProducts1(List<List<String>> products1) {
        this.products1 = products1;
    }

    public List<List<String>> getProducts2() {
        return products2;
    }

    public void setProducts2(List<List<String>> products2) {
        this.products2 = products2;
    }
}

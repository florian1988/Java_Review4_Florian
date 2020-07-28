import java.util.*;

public class Shop {


    int ShopId;
    String name;
    String address;



    Shop( int ShopId, String name, String address ){
        this.ShopId = ShopId;
        this.name = name;
        this.address = address;
    }

    public List<List<String>> products = new ArrayList<List<String>>();
    //public ArrayList<String[]> products = new ArrayList<String[]>();


    public void addProducts(int productId, String productName, int stock){
        ArrayList<String> singleProduct = new ArrayList<String>();


        if( stock > 15){
            System.out.println("Stock cant be greater then 15");
        }else{
            singleProduct.add(String.valueOf(productId));
            singleProduct.add(productName);
            singleProduct.add(String.valueOf(stock));

            products.add(singleProduct);
            //products.add(new String[] {String.valueOf(productId), productName, String.valueOf(stock)});

            // System.out.println(products.size());
            //System.out.println(products.get(0)[2]);

        }



    }


    public void printProduct(){
        for( int i = 0; i < products.size(); i++){


            System.out.print( "Id: " +products.get(i).get(0) + " name: " + products.get(i).get(1) + " Stock: " + products.get(i).get(2) );
            /*for(int x = 0; x < 3; x++){
                System.out.print(products.get(i)[x]);
            }

             */
            System.out.println(" ");

        }
    }

    public void replaceAmountFromStock(int productId, String productName, int stock, int minusStock){

        //System.out.print(stock);
        //System.out.print(productId);


        int d =  productId - 1;
        int f = Integer.parseInt(products.get(stock).get(2));

        System.out.print("f" + f);
        int newStock = f - minusStock;

        //System.out.print("d" + d);

        products.get(d).set(2, String.valueOf(newStock) );

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

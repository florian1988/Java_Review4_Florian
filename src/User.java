import java.util.ArrayList;
import java.util.HashMap;

public class User{

    int userId;
    private static int userCounter = 0;
    String firstName;
    String lastName;
    String eMail;
    String address;
    int zip;
    int phone;
    Shop[] shop = new Shop[3];

    User( String firstName, String lastName, String eMail, String address, int zip, int phone){

        this.userId = userCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.address = address;
        this.zip = zip;
        this.phone = phone;

    }

    User(Shop shop1, Shop shop2){
        this.shop[1] = shop1;
        this.shop[2] = shop2;

    }


    ArrayList <String[]> purchaseList = new ArrayList<String[]>();

    static int i =0;

    public void history(int productId, String productName, double price, int amount,  int shopId ){

            i++;

            if(amount != 1){
                price = price * amount;
            }
        purchaseList.add(new String[]{String.valueOf(i), String.valueOf(productId), productName, String.valueOf(price), String.valueOf(amount), String.valueOf(shopId) });
        //System.out.println(purchaseList.size());
    }



    public void printHistory(){
        for( int i = 0; i < purchaseList.size(); i++){

            System.out.print( "PurchaseNumber: " +purchaseList.get(i)[0] + " Product Id: " + purchaseList.get(i)[1] + " Product Name: " + purchaseList.get(i)[2] + " Price: " + purchaseList.get(i)[3] +
                    " Amount: " + purchaseList.get(i)[4] + "User ID: " + userId + " User Name: " + firstName + " Shop  Id: "  + purchaseList.get(i)[5] );
            /*for(int x = 0; x < 3; x++){
                System.out.print(products.get(i)[x]);
            }

             */
            System.out.println("");
        }


    }






}

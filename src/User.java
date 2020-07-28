import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class User{

    int userId;
    private static int userCounter = 1;
    String firstName;
    String lastName;
    String eMail;
    String address;
    int zip;
    int phone;
    Shop[] shop = new Shop[2];



    User( String firstName, String lastName, String eMail, String address, int zip, int phone, Shop shop2, Shop shop1){

        this.userId = userCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
        this.shop[0] = shop1;
        this.shop[1] = shop2;


    }

    User(){

    }


    public List<List<String>> Users = new ArrayList<List<String>>();

    public void addHistory(int productId, double productPrice, String productName, int amount ){

        ArrayList<String> singleHistory = new ArrayList<String>();

        double price = productPrice * amount;
        if(userId  <= 2){
            singleHistory.add(String.valueOf(shop[0].getName()));
        }else{
            singleHistory.add(String.valueOf(shop[1].getName()));
        }


        singleHistory.add(String.valueOf(productId));
        singleHistory.add(String.valueOf(userId));
        singleHistory.add(firstName);
        singleHistory.add(lastName);
        singleHistory.add(productName);
        singleHistory.add(String.valueOf(amount));
        singleHistory.add(String.valueOf(price));
        Users.add(singleHistory);



    }

    public void printHistory(){
        for( int i = 0; i < Users.size(); i++) {
            System.out.println("----------------User Bill---------------------");
            System.out.println("Shop Name: " + Users.get(i).get(0));
            System.out.println("Product ID: " + Users.get(i).get(1));
            System.out.println("User Id: " + Users.get(i).get(2));
            System.out.println("First Name: " + Users.get(i).get(3));
            System.out.println("Last Name: " + Users.get(i).get(4));
            System.out.println("Product Name: " + Users.get(i).get(5));
            System.out.println("Amount:" + Users.get(i).get(6));
            System.out.println("Product Price: " + Users.get(i).get(7));

        }

    }





}

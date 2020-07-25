public class User{

    int userId;
    private static int userCounter = 0;
    String firstName;
    String lastName;
    String eMail;
    String address;
    int zip;
    int phone;
    Shop shop1;
    Shop shop2;

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
        this.shop1 = shop1;
        this.shop2 = shop2;

    }












}

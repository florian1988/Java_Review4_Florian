import java.util.Scanner;


public class Welcome {



    public void welcomeMenu(){
        System.out.println("-----------------------------------------------");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("|                  Welcome                    |");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("-----------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Make a Selection:");
        System.out.println("1) Display all products");
        System.out.println("2) Display all products of category x");
        System.out.println("3) Display all products where stock < 5");
        System.out.println("4) Display all products out of stock");
        System.out.println("0) Exit");

        int menuScan = scan.nextInt();

        switch(menuScan){
            case 1:
                System.out.println("you take 1");
                break;
            case 2:
                System.out.println("you take 2");
                break;
            case 3:
                System.out.println("you take 3");
                break;
            case 4:
                System.out.println("you take 4");
                break;
            case 5:
                System.out.println("you take 5");
        }

    }




    /*
        ArrayList< Integer > shop1 = new ArrayList< Integer>();
        ArrayList< Integer > shop2 = new ArrayList< Integer>();



    public void addItem(int shopId, int productId, String productName,  int stock){
            this.productId = productId;
            this.productName = productName;
            this.stock1 = stock;

            //stock(stock);

            if(shopId == 1){
                shop1.add(productId);
                System.out.println("The Article " + this.productName + " with the Articlenumber " + this.productId + " get's to Shop " + shop[shopId].getName() + "  the sock is " + this.stock1);
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


 */
}

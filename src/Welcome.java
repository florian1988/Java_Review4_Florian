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
}

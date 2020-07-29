import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;


public class Welcome {


    public void welcomeMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("|                  Welcome                    |");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("-----------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Make a Selection:");
        System.out.println("1) Display all Users");
        System.out.println("2) Display all Shops");
        System.out.println("3) Display all Products");
        System.out.println("4) Exit");


        int menuScan = scan.nextInt();

        switch (menuScan) {
            case 1:
                showUsersOfShop();
                break;
            case 2:
                showListOfShops();
                break;
            case 3:
                showListOfProducts();
                break;

            case 4:
                System.out.println("end");
        }

    }


    ArrayList<User> UsersOfShops = new ArrayList<>();

    public void adToUsersOFShop(User d) {
        UsersOfShops.add(d);

    }

    public void showUsersOfShop() {
        String outputD = String.format("User: %20s,%20s,%20s,%20s,%20s,%20s,%20s,%20s", "User ID", "Firstname", "Lastname", "E-Mail", "Address", "ZIP", "Phone number", "Shop Name");
        System.out.println(outputD);
        for (User d : UsersOfShops) {

            if (d.userId > 2) {
                String output = String.format("User: %20d,%20s,%20s,%20s,%20s,%20d,%20d,%20s", d.userId, d.firstName, d.lastName, d.eMail, d.address, d.zip, d.phone, d.shop[1].getName());
                System.out.println(output);
            } else {
                String output = String.format("User: %20d,%20s,%20s,%20s,%20s,%20d,%20d,%20s", d.userId, d.firstName, d.lastName, d.eMail, d.address, d.zip, d.phone, d.shop[0].getName());
                System.out.println(output);
            }

        }

    }


    ArrayList<Shop> listOfShops = new ArrayList<>();

    public void shopList(Shop f) {
        listOfShops.add(f);

    }

    public void showListOfShops() {
        String outputD = String.format("Shop: %30s %30s %30s", "Shop Id", "Shop Name", "Shop Address");
        System.out.println(outputD);
        for (Shop d : listOfShops) {

            String output = String.format("Shop: %30d %30s %30s", d.ShopId, d.name, d.address);
            System.out.println(output);
        }

    }


    ArrayList<Product> productsOfShop = new ArrayList<>();

    public void productList(Product p) {
        productsOfShop.add(p);
    }


    public void showListOfProducts() {
        String outputD = String.format("Shop: %30s %30s %30s %30s %30s ", "Product Id", "Product Name", "Product Description", "Price", "Category");
        System.out.println(outputD);
        for (Product d : productsOfShop) {

            String output = String.format("Shop: %30d %30s %30s %30.2f %30s", d.productId, d.productName, d.productDescription, d.productPrice, d.category);
            System.out.println(output);
        }

    }

    // print the bill from the user

    public void printUserTxt(User a ){

        a.getUsers();

                try {
                    FileWriter file = new FileWriter("file.txt");
                    file.write("Shopname  ProductId UserId  Firstname  Lastname        Productname        Pieces   Price ");
                    for(int i = 0; i < a.getUsers().size(); i++){
                        file.write("\n");
                        for(int j = 0; j < 8; j++){
                            file.write(a.getUsers().get(i).get(j).toString() + "      ");
                        }}


                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

    }

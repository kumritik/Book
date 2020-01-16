/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author Ritik
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Book a = new Book();
        System.out.println("bookname=" + a.getBookname());
        System.out.println("quantity=" + a.getQuantity());
        System.out.println("price=" + a.getPrice());
        System.out.println("totalprice=" + a.getprice());
        Scanner b = new Scanner(System.in);
        System.out.println("enter a book name");
        String name = b.next();
        System.out.println("enter a quantity");
        int quantity = b.nextInt();
        System.out.println("enter price");
        double price = b.nextDouble();

        Book c = new Book(name, quantity, price);
        System.out.println("bookname=" + c.getBookname());
        System.out.println("quantity=" + c.getQuantity());
        System.out.println("price=" + c.getPrice());
        System.out.println("totalprice=" + c.getprice());

    }

}

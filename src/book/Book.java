/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Ritik
 */
public class Book {
    private String bookname;
    private int quantity;
    private double price;
    Book (){
       bookname="java";
       quantity=10;
       price=50.5;
       
    }
     Book(String bookname,int quantity, double price){
     this.bookname=bookname;
     this.quantity=quantity;
     this.price=price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getprice(){
        return quantity*price;
        
    }
   
}

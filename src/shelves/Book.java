/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelves;

/**
 *
 * @author Admin
 */
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishedYear;
    private double price;

    public Book(String isbn, String title, String author, int publishedYear, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", publishedYear=" + publishedYear + ", price=" + price + '}';
    }
    public void showABook(){
        System.out.printf("|%-13s|%-20s|%-20s|%4d|%10.2f|\n",isbn,title,author,publishedYear,price);
    }
    
}

package scau.luoweizhan.bean;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookid;

    private String title;

    private String author;

    private String publish;

    private float price;

    public Book() {
    }

    public Book(String bookid, String title, String author, String publish, float price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.price = price;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid='" + bookid + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", price=" + price +
                '}';
    }

}

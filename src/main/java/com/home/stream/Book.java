package com.home.stream;

public class Book
{
    private String bookName;
    private Integer price;

    public Book(String bookName, Integer price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null) //If obj is null, return without comparing obj & Book class.
            return false;
        if(this.getClass()!=obj.getClass()) //identifies whether obj is instance of Book class or not.
            return false;
        Book book= (Book) obj;  //type cast obj into book instance.
        return (book.getBookName()==this.getBookName() || book.getBookName().equals(this.getBookName())
         && book.getPrice()==this.getPrice() || book.getPrice().equals(this.getPrice()));
    }

    @Override
    public int hashCode()
    {
        int hash=(this.bookName==null ? 0:this.bookName.hashCode())+
                (this.price==null ? 0:this.price.hashCode());
        return hash;
    }
}

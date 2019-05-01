package com.company;

public class BookApp {
    public static void main(String[] args) {
//        System.out.println("hello");
        Book book1 = new Book();
        book1.setAuthor("Robert Kiosaki");
        book1.setTitle("Rich dad poor dad");
        book1.setDescription("book about money and life");


        Book book2 = new Book();
        book2.setAuthor("Napoleon Hill");
        book2.setTitle("Think and grow rich");
        book2.setDescription("book about success");

        System.out.println(book1.displayText());
        System.out.println("\r");
        System.out.println(book2.displayText());

    }
}

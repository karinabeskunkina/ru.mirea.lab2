package ru.mirea.lab2.punkt7;

import java.util.ArrayList;

public class Bookshelf {
    int n;
    ArrayList<Book> B = new ArrayList<>();
    public Bookshelf(int n){
        this.n = n;
    }
    public void Bookshelf_add(Book a){
        B.add(a);

    }
    public String old(){
        Book a = new Book("", "", 2023);
        for(int i = 0; i < n; ++i){
            if(B.get(i).year < a.year){
                a = B.get(i);
            }
        }
        return "Author: " + a.author + "\tTitle: " + a.title + "\tYear: " + a.year;
    }
    public String young(){
        Book a = new Book("", "", -2023);
        for(int i = 0; i < n; ++i){
            if(B.get(i).year > a.year){
                a = B.get(i);
            }
        }
        return "Author: " + a.author + "\tTitle: " + a.title + "\tYear: " + a.year;
    }

}

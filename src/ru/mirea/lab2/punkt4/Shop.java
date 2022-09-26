package ru.mirea.lab2.punkt4;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    ArrayList<Computer> C = new ArrayList<Computer>();

    public void addComputer(Computer a) {
        C.add(a);
    }


    public void deleteComputer(Computer a) {
        int i = 0;
        for (Computer x : C) {
            System.out.println(x);
            if(x.model == a.model) {
                C.remove(x);
            }
        }
    }
}



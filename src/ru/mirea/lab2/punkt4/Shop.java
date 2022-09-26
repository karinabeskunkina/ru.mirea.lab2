package ru.mirea.lab2.punkt4;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    ArrayList<Computer> C = new ArrayList<Computer>();

    public void addComputer(Computer a) {
        C.add(a);
    }


    public void deleteComputer(String model) {
        for (Computer x : C) {
            if(x.model.equals(model)){
                C.remove(x);
            }
        }
    }
    public String searchComputer(String model) {
        String n = "Not found";
        for (Computer x : C) {
            if (x.model.equals(model)) {
                n =  "Model: " + x.model + "\tProcessor: " + x.processor + "\tMemory: " + x.memory + "\tBattery: " + x.battery;
            }
        }
        return n;
    }
}



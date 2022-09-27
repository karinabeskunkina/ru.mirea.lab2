package ru.mirea.lab2.punkt3;

public class Circle extends Point {

    Point T;
    double r;
    public Circle(){
        r = 0;
    }

    public Circle(double r){
        this.r = r;
    }

    public double getX(){return x;}

    public void setX(double x){ this.x = x;}

    public double getY(){return y;}

    public void setY(double y){ this.y = y;}


}

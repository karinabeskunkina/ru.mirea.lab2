package ru.mirea.lab2.punkt3;

public class Circle extends Point {

    double x;
    double y;
    public Circle(){
        x = 0;
        y = 0;
    };

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return x;}

    public void setX(double x){ this.x = x;}

    public double getY(){return y;}

    public void setY(double y){ this.y = y;}


}

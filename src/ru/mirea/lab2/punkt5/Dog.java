package ru.mirea.lab2.punkt5;

public class Dog {
    String nickname;
    int alt;

    public Dog(String nickname, int alt){
        this.nickname = nickname;
        this.alt = alt;
    }

    public String getNickname(){ return nickname;}

    public void setNickname(String nickname){ this.nickname = nickname;}

    public int getAlt(){ return alt;}

    public void setAlt(int alt){ this.alt = alt;}

    public int ManAlt(){
        return alt * 7;
    }

    public String ToString(){
        return "Name: " + nickname + "\tAlt: " + alt;
    }
}

package com.company;

public class Apartment {
    private String city;
    private int numRooms;
    private int quadr;
    private int price;
    private String phoneNumber;

    public Apartment(String city, int numRooms, int quadr, int price, String phoneNumber) {
        this.city = city;
        this.numRooms = numRooms;
        this.quadr = quadr;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getQuadr() {
        return quadr;
    }

    public void setQuadr(int quadr) {
        this.quadr = quadr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

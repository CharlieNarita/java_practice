package com.charlie.polymorph.house_rental.domain_model;

/**
 * 1.class House instance is house whole information
 * 2.attributes determinate the interface feature
 */
public class House {
    private int id;
    private String owner;
    private String phone;
    private String address;
    private int rent;
    private String state;

    public House(int id, String owner, String phone, String address, int rent, String state) {
        this.id = id;
        this.owner = owner;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t" + owner +
                "\t" + phone +
                "\t\t" + address +
                "\t\t" + rent +
                "\t" + state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

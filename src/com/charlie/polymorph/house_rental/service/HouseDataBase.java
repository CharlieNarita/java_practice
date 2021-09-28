package com.charlie.polymorph.house_rental.service;

import com.charlie.polymorph.house_rental.domain_model.House;

import java.util.*;

public class HouseDataBase {
    private ArrayList<House> list = new ArrayList();

    public HouseDataBase() {
        this.initDataBase();
    }

    public void initDataBase() {
        list.add(new House(1, "jack", "1390123", "AA_street No123", 3800, "idle"));
        list.add(new House(2, "mike", "1375013", "BB_street No345", 2500, "idle"));
        list.add(new House(3, "tom ", "1520759", "CC_street No996", 1950, "idle"));
        list.add(new House(4, "mary", "1365998", "AK_street No565", 3500, "idle"));
        list.add(new House(5, "anna", "1390237", "AR_street No331", 4200, "idle"));
    }

    public ArrayList<House> getList() {
        return list;
    }

    public void setList(ArrayList<House> list) {
        this.list = list;
    }
}

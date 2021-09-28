package com.charlie.polymorph.house_rental.service;

import com.charlie.polymorph.house_rental.domain_model.House;

import java.util.*;

/**
 * class HouseService function:
 * 1.response HouseView request
 * 2.operate the house information(CRUD)
 * (create, read/retrieve, update, delete)
 */
public class HouseService {
    ArrayList<House> houses;
    private HouseDataBase houseDataBase;
    private int houseNum;
    private int idCounter;

    public HouseService() {
        this.houseDataBase = new HouseDataBase();
        this.houses = houseDataBase.getList();
        this.houseNum = houses.size();
        this.idCounter = houses.size();
    }

    public boolean addHouse(House h) {
        boolean b ;
        if (h == null || !(h instanceof House)) {
            b = false;
        }
        b = houses.add(h);
        houseNum++;
        h.setId(++idCounter);
        return b;
    }

    /**
     * this removeHouse method contain iterator
     * attention the ArrayList is not synchronized
     * @param id
     * @return result of delete
     */
    public boolean removeHouse(int id) {
       //find element which will delete
        boolean b = false;
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House next =  iterator.next();
            if(id == next.getId()) {
                b = houses.remove(next);
                break;// this break is very important
            }
        }
        if(b) {
            houseNum--;
        }
        return b;
    }

    public void listHouse() {
        for (House h : houses) {
            System.out.println(h + "\n");
        }
    }

    public House searchHouse(int id) {
        House h = null;
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House next =  iterator.next();
            if(id == next.getId()) {
                h = next;
            }
        }
        return h;
    }
}

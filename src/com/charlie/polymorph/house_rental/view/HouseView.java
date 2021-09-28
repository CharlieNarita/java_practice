package com.charlie.polymorph.house_rental.view;

import com.charlie.polymorph.house_rental.domain_model.House;
import com.charlie.polymorph.house_rental.service.HouseService;
import com.charlie.polymorph.house_rental.utils.Utility;

import java.util.*;

/**
 * class HouseView function:
 * 1.display the interface
 * 2.receive customer input data
 * 3.call other classes to operate the house information
 */

public class HouseView {
    private boolean loop = true;    //default true
    private char key = ' '; //user input for selection

    private HouseService houseService;

    public HouseView() {
        initHouseService();
    }

    //add new house
    public void addNewHouse() {
        System.out.println("------Add New House------");
        System.out.print("owner: ");
        String name = Utility.readString(10);
        System.out.print("phone: ");
        String phone = Utility.readString(8);
        System.out.print("address: ");
        String address = Utility.readString(20);
        System.out.print("rent: ");
        int rent = Utility.readInt();
        System.out.print("state: ");
        String state = Utility.readString(6);
        //create a new House instance, id is assigned by system
        House house = new House(0, name, phone, address, rent, state);
        boolean b = houseService.addHouse(house);
        if (b) {
            System.out.println("-----New House Added-----");
        } else {
            System.out.println("-----Failed to add !-----");
        }
    }

    //receive id, call HouseService method
    public void deleteHouse() {
        System.out.println("------Delete House------");
        System.out.print("enter house id(-1 cancel) you want to delete: ");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("cancel delete program");
            return;
        }
        char choice = Utility.readConfirmSelection();   //loop
        if (choice == 'Y') {
            boolean b = houseService.removeHouse(delId);
            if (b) {
                System.out.println("id=" + delId + " house has been delete!");
            } else {
                System.out.println("-----Failed to delete-----");
            }
        } else {
            System.out.println("cancel delete program");
            return;
        }
        System.out.println();
    }

    //update the house information
    public void editHouse() {
        System.out.println("-----Update House-----");
        System.out.println("enter id(-1 cancel): ");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("cancel update program");
            return;
        }
        House h = houseService.searchHouse(updateId);
        if(h == null) {
            System.out.println("no house you needed found");
            return;
        }
        //update owner name
        System.out.print("owner = " + h.getOwner() + ": ");
        String owner = Utility.readString(10, "");
        if(!"".equals(owner)) {
            h.setOwner(owner);
        }

        //update phone
        System.out.print("phone = " + h.getPhone() + ": ");
        String phone = Utility.readString(10, "");
        if(!"".equals(phone)) {
            h.setPhone(phone);
        }

        //update address
        System.out.print("address = " + h.getAddress() + ": ");
        String address = Utility.readString(20, "");
        if(!"".equals(address)) {
            h.setAddress(address);
        }

        //update rent
        System.out.print("rent = " + h.getRent() + ": ");
        int rent = Utility.readInt(-1);
        if(! (-1 == rent)) {
            h.setRent(rent);
        }

        //update state
        System.out.print("state = " + h.getState() + ": ");
        String state = Utility.readString(10, "");
        if(!"".equals(state)) {
            h.setState(state);
        }

        System.out.println("update successful");
    }

    //search needed house by id
    public void findHouse() {
        System.out.println("-----Search House-----");
        System.out.println("enter id: ");
        int findId = Utility.readInt();
        //call service search method
        House h = houseService.searchHouse(findId);
        if (h != null) {
            System.out.println(h);
        } else {
            System.out.println("no designate house found");
        }
    }

    //list all houses information
    public void showHouses() {
        System.out.println("-----Houses List-----");
        System.out.println("No\tOwner\tPhone\t\tAddress\t\t\t\tRent\tState");
        houseService.listHouse();
        System.out.println("------List Done------");
    }

    //display menu
    public void showMenu() {
        List<String> list = initMenu();
        for (String s : list) {
            System.out.println(s);
        }
    }

    //initialized the HouseService
    public void initHouseService() {
        houseService = new HouseService();
    }

    //initialized the menu
    public List initMenu() {
        List<String> list = new ArrayList();
        list.add("-----House Rental System-----");
        list.add("\t\t1 Add New House");
        list.add("\t\t2 Search House");
        list.add("\t\t3 Delete House");
        list.add("\t\t4 Edit House");
        list.add("\t\t5 List House");
        list.add("\t\t6 Exit System");
        list.add("Please enter your selection(1-6): ");
        return list;
    }

    public void exitSys() {
        char c;
        System.out.println("---Exit System---");
        c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        } else {
            System.out.println("cancel exit the system");
            return;
        }
    }

    public void mainMenu() {
        do {
            showMenu();
            key = Utility.readChar();

            switch (key) {
                case '1':
                    //add new house
                    addNewHouse();
                    break;
                case '2':
                    //find house
                    findHouse();
                    break;
                case '3':
                    //delete designate house
                    deleteHouse();
                    break;
                case '4':
                    //update house
                    editHouse();
                    break;
                case '5':
                    //list all houses information
                    showHouses();
                    break;
                case '6':
                    //here we use Utility.readConfirmSelection();
                    exitSys();
                    break;
            }

        } while (loop);
    }
}

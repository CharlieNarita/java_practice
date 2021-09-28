package com.charlie.practice;

public class Count3Quit_OO_Edition {
    public static void main(String[] args) {
        KidCircle kc = new KidCircle();
        kc.initKids(500);
        System.out.println("there are " + kc.getCount() + " kids in circle");

        int countNum = 0;
        KidCircle.Kid k = kc.getFirst();
        while (kc.getCount() > 1) {
            countNum++;
            if (countNum == 3) {
                countNum = 0;
                kc.removeKid(k);
            }
            k = k.right;
        }

        System.out.println(kc.getFirst().id);
    }
}


class KidCircle {
    private Kid first;
    private Kid last;
    public int count = 0;

    public KidCircle() {

    }

    public void addKid() {
        Kid k = new Kid();
        k.id = count;
        if (count <= 0) {
            first = k;
            last = k;
            k.left = k;
            k.right = k;
        } else {
            last.right = k;
            k.left = last;
            k.right = first;
            first.left = k;
            last = k;
        }
        count++;
    }

    public void removeKid(Kid k) {
        if (count <= 0) {
            System.out.println("No kids in circle!");
            return;
        } else if (count == 1) {
            first = last = null;
        } else {
            k.left.right = k.right;
            k.right.left = k.left;

            if (k == first) {
                first = k.right;
            } else if (k == last) {
                last = k.left;
            }
        }
        count--;
    }

    public void initKids(int n) {
        for (int i = 0; i < n; i++) {
            addKid();
        }
    }

    //inner class
    class Kid {
        int id;
        Kid left;
        Kid right;
    }

    public int getCount() {
        return count;
    }

    public Kid getFirst() {
        return first;
    }

    public Kid getLast() {
        return last;
    }
}

package com.charlie.practice;

//specification:
        /*  1. create two-dimension array as maze
            2. element value 0 represent unblocked and 1 is blocked
            3. define a findWay method for searching escape way
            4. return true when find and return false if not
            5. i,j is current location
            6. use recursion solve this problem
            7. value 2 is current position is passable, 3 is used pass but impasse
            8. moving strategy down->right->up->left
            9. when map[9][9] == 2, win and over
        */
public class RecursionMaze {
    static final int UNBLOCKED = 0;
    static final int BLOCKED = 1;
    static final int ROW = 9;
    static final int COLUMN = 9;

    public static void main(String[] args) {
        int[][] map = init2DArr(ROW, COLUMN);

        //set blocked
        setBlocked(map, 3, 1);
        setBlocked(map, 3, 2);
        setBlocked(map, 3, 3);

        //print the 2D array
        print2DArr(map);
        System.out.println("--------------------------------");

        boolean result = findWay(map, 1, 1);
        if (result) {
            System.out.println("win, escape successful");
        } else {
            System.out.println("escape fail");
        }
        print2DArr(map);

    }

    public static boolean findWay(int[][] map, int i, int j) {
        if (map[ROW - 2][COLUMN - 2] == 2) { //escape win
            return true;
        } else {
            if (map[i][j] == 0) {    //can go
                //assume can go
                map[i][j] = 2;
                //detect way
                if (findWay(map, i + 1, j)) {  //detect down
                    return true;
                } else if (findWay(map, i, j + 1)) {   //detect right
                    return true;
                } else if (findWay(map, i - 1, j)) {   //detect up
                    return true;
                } else if (findWay(map, i, j - 1)) {   //detect left
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {    //map[i][j] == 1/2/3
                return false;
            }
        }
    }

    public static int[][] init2DArr(int row, int column) {
        int[][] map = new int[row][column];
        int lenV = map.length;
        int lenH = map[0].length;

        //init 2D array
        for (int i = 0; i < lenV; i++) {
            for (int j = 0; j < lenH; j++) {
                if (i == 0 || i == lenV - 1 || j == 0 || j == lenH - 1) {
                    map[i][j] = BLOCKED;
                } else {
                    map[i][j] = UNBLOCKED;
                }
            }
        }

        return map;
    }

    public static void setBlocked(int[][] arr, int i, int j) {
        arr[i][j] = BLOCKED;
    }

    public static void setUnblocked(int[][] arr, int i, int j) {
        arr[i][j] = UNBLOCKED;
    }

    public static void print2DArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


